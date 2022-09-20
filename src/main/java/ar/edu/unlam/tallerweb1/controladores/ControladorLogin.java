package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.modelo.Billetera;
import ar.edu.unlam.tallerweb1.modelo.Nivel;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.servicios.ServicioBilletera;
import ar.edu.unlam.tallerweb1.servicios.ServicioNivel;
import ar.edu.unlam.tallerweb1.servicios.ServicioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ControladorLogin {

	// La anotacion @Autowired indica a Spring que se debe utilizar el contructor como mecanismo de inyección de dependencias,
	// es decir, qeue lo parametros del mismo deben ser un bean de spring y el framewrok automaticamente pasa como parametro
	// el bean correspondiente, en este caso, un objeto de una clase que implemente la interface ServicioLogin,
	// dicha clase debe estar anotada como @Service o @Repository y debe estar en un paquete de los indicados en
	// applicationContext.xml
	private ServicioUsuario servicioUsuario;
	private ServicioBilletera servicioBilletera;
	private ServicioNivel servicioNivel;

	@Autowired
	public ControladorLogin(ServicioUsuario servicioUsuario, ServicioBilletera servicioBilletera, ServicioNivel servicioNivel){
		this.servicioUsuario   = servicioUsuario;
		this.servicioBilletera = servicioBilletera;
		this.servicioNivel     = servicioNivel;
	}

	// Este metodo escucha la URL localhost:8080/NOMBRE_APP/login si la misma es invocada por metodo http GET
	@RequestMapping("/login")
	public ModelAndView irALogin() {

		ModelMap modelo = new ModelMap();
		// Se agrega al modelo un objeto con key 'datosLogin' para que el mismo sea asociado
		// al model attribute del form que esta definido en la vista 'login'
		modelo.put("datosLogin", new DatosLogin());
		// Se va a la vista login (el nombre completo de la lista se resuelve utilizando el view resolver definido en el archivo spring-servlet.xml)
		// y se envian los datos a la misma  dentro del modelo
		return new ModelAndView("login", modelo);
	}

	// Este metodo escucha la URL validar-login siempre y cuando se invoque con metodo http POST
	// El metodo recibe un objeto Usuario el que tiene los datos ingresados en el form correspondiente y se corresponde con el modelAttribute definido en el
	// tag form:form
	@RequestMapping(path = "/validar-login", method = RequestMethod.POST)
	public ModelAndView validarLogin(@ModelAttribute("datosLogin") DatosLogin datosLogin, HttpServletRequest request) {
		ModelMap model = new ModelMap();

		// invoca el metodo consultarUsuario del servicio y hace un redirect a la URL /home, esto es, en lugar de enviar a una vista
		// hace una llamada a otro action a traves de la URL correspondiente a esta
		Usuario usuarioBuscado = servicioUsuario.buscarUsuario(datosLogin.getEmail(), datosLogin.getPassword());
		if (usuarioBuscado != null) {
			if(usuarioBuscado.getRol().getId() == 2) {
			Billetera billetera = servicioBilletera.traerDatosBilletera(usuarioBuscado);
			Nivel nivel = servicioNivel.traerDatosDelNivel(usuarioBuscado.getNivel().getId());

//			------ SE GUARDAN DATOS EN LA SESION -------
			request.getSession().setAttribute("idUsuario", usuarioBuscado.getId());
			request.getSession().setAttribute("billetera", billetera);
			request.getSession().setAttribute("nivel", nivel);
//          -----------------------------------------------------------
				return new ModelAndView("home");
		 	}else {
				model.put("usuarios",servicioUsuario.getAll());
				model.put("max", servicioUsuario.rankingJugadores());
				return new ModelAndView("homeAdmin",model);
			}
		} else {
			// si el usuario no existe agrega un mensaje de error en el modelo.
			model.put("error", "Usuario o clave incorrecta");
		}
		return new ModelAndView("login", model);
	}

	// Escucha la URL /home por GET, y redirige a una vista.
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public ModelAndView irAHome(HttpServletRequest request) {
//		-- LLAMAMOS A AL ID DEL USUARIO QUE SE GUARDÓ EN LA SESION CON LA CLAVE QUE LE ASIGNAMOS --
		Integer idUSer = (Integer) request.getSession().getAttribute("idUsuario");
		if (idUSer != null) {
			return new ModelAndView("home");
		}
		else {
			return new ModelAndView("redirect:/login");
		}
	}

	// Escucha la url /, y redirige a la URL /login, es lo mismo que si se invoca la url /login directamente.
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ModelAndView inicio() {
		return new ModelAndView("redirect:/login");
	}
}
