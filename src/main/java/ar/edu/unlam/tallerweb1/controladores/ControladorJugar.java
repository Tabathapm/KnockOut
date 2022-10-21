package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.modelo.Coleccion;
import ar.edu.unlam.tallerweb1.modelo.Personaje;
import ar.edu.unlam.tallerweb1.modelo.Rol;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.servicios.ServicioColeccion;
import ar.edu.unlam.tallerweb1.servicios.ServicioPersonaje;
import ar.edu.unlam.tallerweb1.servicios.ServicioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ControladorJugar {
    //private ServicioJugar servicioJugar;
    private ServicioPersonaje servicioPersonaje;
    private ServicioColeccion servicioColeccion;
    private ServicioUsuario servicioUsuario;
    private List<Personaje>misPersonajes;
    @Autowired
    public ControladorJugar(ServicioPersonaje servicioPersonaje, ServicioColeccion servicioColeccion, ServicioUsuario servicioUsuario){
        this.servicioPersonaje = servicioPersonaje;
        this.servicioColeccion = servicioColeccion;
        this.servicioUsuario = servicioUsuario;
    }

    @RequestMapping( "/Jugar")
    public ModelAndView irAJugar(HttpServletRequest request) {
        ModelMap model = new ModelMap();
//      --------------------------------
        Integer usuario_id = (Integer) request.getSession().getAttribute("idUsuario");
        if(usuario_id == null){
            return new ModelAndView("redirect:/login");
        }
        if(request.getSession().getAttribute("rol") == Rol.ADMIN){
            return new ModelAndView("redirect:/inicio");
        }

//      se busca al usuario
        Usuario usuario = servicioUsuario.buscarPorID(usuario_id);

//      traer la coleccion con usuarioID
        Coleccion coleccion = servicioColeccion.traerColeccion(usuario);
//      --------------------------------
        this.misPersonajes = servicioPersonaje.listaDePersonajesEnMiColeccion(coleccion);
//      --------------------------------
        model.put("personajes", this.misPersonajes );

        //return new ModelAndView("combate", model);
        return new ModelAndView("seleccionarPersonaje", model);
    }

    @RequestMapping(value = "/seleccionPersonaje", method= RequestMethod.GET)
    public ModelAndView seleccionPersonajeParaJugar(@RequestParam("id")Integer id, RedirectAttributes atributo) {
//      --------------------------------
        Personaje personajeElegido=servicioPersonaje.buscarPorId(id);
        //      --------------------------------
//se le pasa el personaje buscado al atributo asi se redirige a combate

        atributo.addFlashAttribute(personajeElegido);
//      --------------------------------
        return new ModelAndView("redirect:/combate");
    }

    @RequestMapping("/combate")
    public ModelAndView combate(@ModelAttribute Personaje personajeElegido) {
//      --------------------------------
        ModelMap model = new ModelMap();
//      --------------------------------
        model.addAttribute("personajeElegido",personajeElegido);
        model.put("personajes", this.misPersonajes );
//      --------------------------------
        return new ModelAndView("combate",model);
    }
}
