package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.servicios.ServicioRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorRegistro {

    private ServicioRegistro servicioRegistro;

    @Autowired
    public ControladorRegistro(ServicioRegistro servicioRegistro){
        this.servicioRegistro=servicioRegistro;
    }

    @RequestMapping("registro")
    public ModelAndView irARegistrarse(){
        return new ModelAndView("registro");
    }


    @RequestMapping(path = "/registrarUsuario")
    public ModelAndView registrarUsuario(@ModelAttribute("usuario") DatosRegistro datosRegistro){
        ModelMap model = new ModelMap();

        servicioRegistro.addUsuario(datosRegistro);

        return new ModelAndView("home",model);

    }

//    @RequestMapping(path = "/registrarse")
//    public ModelAndView registrarse(@ModelAttribute("usuario") DatosRegistro datosRegistro){
//
//        ModelMap model = new ModelMap();
//        Usuario usuarioRepetido = servicioRegistro.consultarUsuario(datosRegistro.getUsername());
//
//        servicioRegistro.addUsuario(datosRegistro);
//
//        return new ModelAndView("home",model);
//
//    }


}
