package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.modelo.Personaje;
import ar.edu.unlam.tallerweb1.servicios.ServicioPersonaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ControladorComprarPersonaje {

    private ServicioPersonaje servicioPersonaje;

    @Autowired
    public ControladorComprarPersonaje(ServicioPersonaje servicioPersonaje){
        this.servicioPersonaje = servicioPersonaje;
    }

    @RequestMapping("/comprarPersonaje")
    public ModelAndView irAComprarPersonaje(HttpServletRequest request) {
//      --------------------------------
        ModelMap model = new ModelMap();
//      --------------------------------
        //Si no inicio sesion en el sistema, no puede ver la coleccion
        if(request.getSession().getAttribute("idUsuario") == null){
            return new ModelAndView("redirect:/login", model);
        }

        List<Personaje> listaPersonajes = servicioPersonaje.listaDePersonajesEnVenta();
//      --------------------------------
        model.put("personajes", listaPersonajes);
//      --------------------------------
        return new ModelAndView("comprarPersonaje", model);
    }


}