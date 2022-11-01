package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.modelo.*;
import ar.edu.unlam.tallerweb1.servicios.*;
import org.apache.commons.lang.ArrayUtils;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class ControladorJugar {
    //private ServicioJugar servicioJugar;
    private ServicioPersonaje servicioPersonaje;
    private ServicioColeccion servicioColeccion;
    private ServicioUsuario servicioUsuario;
    private List<Personaje>misPersonajes;
    private ServicioNivel servicioNivel;
    private ServicioBilletera servicioBilletera;
    @Autowired
    public ControladorJugar(ServicioPersonaje servicioPersonaje, ServicioColeccion servicioColeccion,
                            ServicioUsuario servicioUsuario,ServicioNivel servicioNivel, ServicioBilletera servicioBilletera){
        this.servicioPersonaje = servicioPersonaje;
        this.servicioColeccion = servicioColeccion;
        this.servicioUsuario   = servicioUsuario;
        this.servicioNivel     = servicioNivel;
        this.servicioBilletera = servicioBilletera;
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

    @RequestMapping(value = "/seleccionDePersonaje", method= RequestMethod.GET)
    public ModelAndView seleccionDePersonajeParaJugar(@RequestParam("personajesElegidos")String[] personajesElegidos, HttpServletRequest request) {
//      --------------------------------------------------------------
        if(request.getSession().getAttribute("idUsuario") == null){
            return new ModelAndView("redirect:/login");
        }
        if(request.getSession().getAttribute("rol") == Rol.ADMIN){
            return new ModelAndView("redirect:/inicio");
        }
//      --------------------------------
        ModelMap model = new ModelMap();
//      --------------------------------
        if (personajesElegidos.length == 3){

            List<Personaje> listaDePersonajesElegidos = new ArrayList<>();

            for (String idPersonaje : personajesElegidos){
                Integer idParseado  = Integer.parseInt(idPersonaje);
                Personaje personaje = servicioPersonaje.buscarPorId(idParseado);
                listaDePersonajesElegidos.add(personaje);
            }

            Personaje per1 = listaDePersonajesElegidos.get(0);
            Personaje per2 = listaDePersonajesElegidos.get(1);
            Personaje per3 = listaDePersonajesElegidos.get(2);

//          --------- Jugador boot -----------
            Random preNumRandom = new Random();
            Integer maxId       = servicioPersonaje.maxId();

            int numRandom1  = (int) (preNumRandom.nextDouble() * maxId + 1);
            int numRandom2  = (int) (preNumRandom.nextDouble() * maxId + 1);
            int numRandom3  = (int) (preNumRandom.nextDouble() * maxId + 1);

            Personaje personajeBootUno  = servicioPersonaje.buscarPorId(numRandom1);
            Personaje personajeBootDos  = servicioPersonaje.buscarPorId(numRandom2);
            Personaje personajeBootTres = servicioPersonaje.buscarPorId(numRandom3);

            model.put("per1", per1);
            model.put("per2", per2);
            model.put("per3", per3);

            model.put("personajeBootUno", personajeBootUno);
            model.put("personajeBootDos", personajeBootDos);
            model.put("personajeBootTres", personajeBootTres);

            return new ModelAndView("jugar", model);

        } else if (personajesElegidos.length > 3) {
            model.put("error","Se pasó del límite de personajes elegidos.");
            return new ModelAndView("error", model);
        }else {
            model.put("error", "Debe seleccionar <b>TRES</b> personajes.");
        }


        return new ModelAndView("error", model);
    }

    @RequestMapping(value = "/verResultados", method= RequestMethod.GET)
    public ModelAndView verResultados(HttpServletRequest request, @RequestParam("personajeUno") String personajeElegidoUno,
                                                                  @RequestParam("personajeDos") String personajeElegidoDos,
                                                                  @RequestParam("personajeTres") String personajeElegidoTres,
                                                                  @RequestParam("personajeBootUno") String personajeBootUno,
                                                                  @RequestParam("personajeBootDos") String personajeBootDos,
                                                                  @RequestParam("personajeBootTres") String personajeBootTres){

        if(request.getSession().getAttribute("idUsuario") == null){
            return new ModelAndView("redirect:/login");
        }
        if(request.getSession().getAttribute("rol") == Rol.ADMIN){
            return new ModelAndView("redirect:/inicio");
        }

        ModelMap model = new ModelMap();

        Personaje p1 = servicioPersonaje.buscarPorId(Integer.parseInt(personajeElegidoUno));
        Personaje p2 = servicioPersonaje.buscarPorId(Integer.parseInt(personajeElegidoDos));
        Personaje p3 = servicioPersonaje.buscarPorId(Integer.parseInt(personajeElegidoTres));

        Personaje boot1 = servicioPersonaje.buscarPorId(Integer.parseInt(personajeBootUno));
        Personaje boot2 = servicioPersonaje.buscarPorId(Integer.parseInt(personajeBootDos));
        Personaje boot3 = servicioPersonaje.buscarPorId(Integer.parseInt(personajeBootTres));

        model.put("p1", p1);
        model.put("p2", p2);
        model.put("p3", p3);

        model.put("boot1", boot1);
        model.put("boot2", boot2);
        model.put("boot3", boot3);

        Integer contadorUsuario = 0;
        Integer contadorBoot    = 0;

        List<Integer> round1 = servicioPersonaje.rounds(p1,boot1,contadorUsuario,contadorBoot);
        contadorUsuario = round1.get(0);
        contadorBoot    = round1.get(1);
        model.put("round1",contadorUsuario + ":" + contadorBoot);

        List<Integer> round2 = servicioPersonaje.rounds(p2,boot2,contadorUsuario,contadorBoot);
        contadorUsuario = round2.get(0);
        contadorBoot    = round2.get(1);
        model.put("round2",contadorUsuario + ":" + contadorBoot);

        List<Integer> round3 = servicioPersonaje.rounds(p3,boot3,contadorUsuario,contadorBoot);
        contadorUsuario  = round3.get(0);
        contadorBoot     = round3.get(1);
        model.put("round3",contadorUsuario + ":" + contadorBoot);

        Usuario usuario     = servicioUsuario.buscarPorID((Integer) request.getSession().getAttribute("idUsuario"));
        Nivel nivel         = servicioNivel.traerDatosDelNivel(usuario.getNivel().getId());
        Billetera billetera = servicioBilletera.traerDatosBilletera(usuario);
        String quienGana    = servicioPersonaje.quienGana(contadorUsuario, contadorBoot,billetera,request,nivel,usuario);

        if(quienGana.equals("ganaste")){
            model.put("ganador","<b>¡Ganaste!</b>");
        }
        else if(quienGana.equals("empate")){
            model.put("empate","<b>Empate</b>");
        }
        else{
            model.put("perdedor","<b>Perdiste</b>");
        }

        return new ModelAndView("verResultados",model);
    }


}
