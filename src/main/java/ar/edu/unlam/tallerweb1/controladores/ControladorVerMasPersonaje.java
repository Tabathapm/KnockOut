package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.modelo.Personaje;
import ar.edu.unlam.tallerweb1.servicios.ServicioPersonaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorVerMasPersonaje {
    private ServicioPersonaje servicioPersonaje;

    @Autowired
    public ControladorVerMasPersonaje(ServicioPersonaje servicioPersonaje){
        this.servicioPersonaje = servicioPersonaje;
    }

    @RequestMapping(value = "/verMasPersonaje", method= RequestMethod.GET)
    public ModelAndView verDescripcionPersonaje(@RequestParam("id")Integer id) {
//      --------------------------------
        ModelMap model = new ModelMap();
//      --------------------------------
        Personaje personaje=servicioPersonaje.buscarPorId(id);
//      --------------------------------
        model.put("personaje", personaje);
//      --------------------------------
        return new ModelAndView("descripcionPersonaje", model);
    }
}
