package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class ControladorComprarMonedas {









    @RequestMapping("/comprarMonedas")
    public ModelAndView irAComprarMonedas() {
//      --------------------------------
//        ModelMap model = new ModelMap();
////      --------------------------------
//        List<Personaje> listaPersonajes = servicioPersonaje.listaDePersonajesEnVenta();
////      --------------------------------
//        model.put("personajes", listaPersonajes);
////      --------------------------------
//        return new ModelAndView("comprarPersonaje", model);

        return new ModelAndView("comprarMonedas");
    }
}
