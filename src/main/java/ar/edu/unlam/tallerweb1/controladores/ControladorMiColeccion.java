package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.modelo.Personaje;
import ar.edu.unlam.tallerweb1.servicios.ServicioPersonaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ControladorMiColeccion {

    private ServicioPersonaje servicioPersonaje;

    @Autowired
    public ControladorMiColeccion(ServicioPersonaje servicioPersonaje){
        this.servicioPersonaje = servicioPersonaje;
    }

    @RequestMapping("/miColeccion")
    public ModelAndView irAMiColeccion() {
//      --------------------------------
        ModelMap model = new ModelMap();
//      --------------------------------
        List<Personaje> listaPersonajes = servicioPersonaje.listaDePersonajesEnMiColeccion();
//      --------------------------------
        model.put("personajes", listaPersonajes);
//      --------------------------------
        return new ModelAndView("miColeccion", model);
    }

    @RequestMapping("/venderPersonaje")
    public ModelAndView venderPersonaje(){
        return null;
    }
}
