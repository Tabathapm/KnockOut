package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.modelo.Coleccion;
import ar.edu.unlam.tallerweb1.modelo.Personaje;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.servicios.ServicioColeccion;
import ar.edu.unlam.tallerweb1.servicios.ServicioPersonaje;
import ar.edu.unlam.tallerweb1.servicios.ServicioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ControladorMiColeccion {

    private ServicioPersonaje servicioPersonaje;
    private ServicioColeccion servicioColeccion;
    private ServicioUsuario servicioUsuario;

    @Autowired
    public ControladorMiColeccion(ServicioPersonaje servicioPersonaje, ServicioColeccion servicioColeccion, ServicioUsuario servicioUsuario){
        this.servicioPersonaje = servicioPersonaje;
        this.servicioColeccion = servicioColeccion;
        this.servicioUsuario = servicioUsuario;
    }

    @RequestMapping("/miColeccion")
    public ModelAndView irAMiColeccion(HttpServletRequest request) {
//      --------------------------------
        ModelMap model = new ModelMap();
//      --------------------------------
        //Si no inicio sesion en el sistema, no puede ver la coleccion
        if(request.getSession().getAttribute("idUsuario") == null){
            return new ModelAndView("redirect:/login", model);
        }
//      MODIFICACIONES A FUTURO:
//          - buscar la coleccion con el id del usuario
//          - mostrar solamente los personajes que están en esa colección

        Integer usuario_id = (Integer) request.getSession().getAttribute("idUsuario");

//      se busca al usuario
        Usuario usuario = servicioUsuario.buscarPorID(usuario_id);

//      traer la coleccion con usuarioID
        Coleccion coleccion = servicioColeccion.traerColeccion(usuario);

        List <Personaje> listaPersonajes = servicioPersonaje.listaDePersonajesEnMiColeccion(coleccion);
        //List <Personaje> listaPer =    coleccion.getPersonajes();

//      --------------------------------
        //List<Personaje> listaPersonajes = servicioPersonaje.listaDePersonajesEnMiColeccion();
//      --------------------------------
        model.put("personajes", listaPersonajes);
        model.put("coleccion", coleccion);

//      --------------------------------
        return new ModelAndView("miColeccion", model);
    }

    @RequestMapping("/venderPersonaje")
    public ModelAndView venderPersonaje(){


        return null;
    }
}
