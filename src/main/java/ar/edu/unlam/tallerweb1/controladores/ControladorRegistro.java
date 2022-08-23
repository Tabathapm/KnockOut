package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.servicios.ServicioRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
        Usuario usuarioEmail = servicioRegistro.consultarUsuarioPorEmail(datosRegistro.getEmail());
        if(usuarioEmail==null){
            servicioRegistro.addUsuario(datosRegistro);
            Usuario user = servicioRegistro.consultarUsuarioPorEmail(datosRegistro.getEmail());
            servicioRegistro.agregarBilletera(user);
            return new ModelAndView("redirect:/login");
        }
        else{
            model.put("error","No se puede registrar con un email ya registrado");
        }

        return new ModelAndView("registro",model);

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
