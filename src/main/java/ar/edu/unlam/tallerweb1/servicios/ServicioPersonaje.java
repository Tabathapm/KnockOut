package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Personaje;

import java.util.List;

public interface ServicioPersonaje {

    List<Personaje> listaDePersonajes();
    List<Personaje> listaDePersonajesEnVenta();
    List<Personaje> listaDePersonajesEnMiColeccion();
}
