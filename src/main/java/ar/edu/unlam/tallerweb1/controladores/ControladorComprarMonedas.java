package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.servicios.ServicioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ControladorComprarMonedas {

private ServicioUsuario servicioUsuario;


    @Autowired
    public ControladorComprarMonedas(ServicioUsuario servicioUsuario) {
        this.servicioUsuario = servicioUsuario;
    }


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

    @RequestMapping("/pagoMonedas")
    public ModelAndView irAPagarMonedas(){

        return new ModelAndView("pagoMonedas");

    }
}
