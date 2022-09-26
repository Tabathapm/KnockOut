package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.modelo.Personaje;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.servicios.ServicioPersonaje;
import ar.edu.unlam.tallerweb1.servicios.ServicioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ControladorAdmin {

    private ServicioUsuario servicioUsuario;

    @Autowired
    public ControladorAdmin(ServicioUsuario servicioUsuario){
        this.servicioUsuario = servicioUsuario;
    }

    @RequestMapping("/inicio")
    public ModelAndView verHome(){
        ModelMap model =new ModelMap();

        model.put("usuarios",servicioUsuario.getAll());
        model.put("max", servicioUsuario.rankingJugadores());
        model.put("maximo",servicioUsuario.jugadorConMasNivel());

        return new ModelAndView ("homeAdmin",model);
    }

    //revisar de agregar habilitado/inhabilitado
    //usuario pueda dar de baja su cuenta --borrar todos los datos bbddd

    @RequestMapping(value = "/cambio-estado", method= RequestMethod.GET)
    public ModelAndView verDescripcionPersonaje(@RequestParam("id")Integer id, HttpServletRequest request) {

        servicioUsuario.cambiarEstadoUsuario(id);

        return new ModelAndView("redirect:/inicio");
    }

    //Control personajes
    //Crear novedades de admin
}