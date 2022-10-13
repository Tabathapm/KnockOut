package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Coleccion;
import ar.edu.unlam.tallerweb1.modelo.Personaje;

import java.util.List;

public interface ServicioPersonaje {

    List<Personaje> listaDePersonajes();
    List<Personaje> listaDePersonajesEnVenta();
    List<Personaje> listaDePersonajesEnMiColeccion();
    Personaje buscarPorId(Integer id);
    public Integer maxId();
    void modificar(Personaje personaje);
    List<Personaje> listaDePersonajesEnMiColeccion(Coleccion coleccion);

    Personaje traerPersonaje(Integer id);

    List<Personaje> eliminarpersonaje(List<Personaje> listaPersonajes, Personaje personaje);

    void eliminarPersonaje(Integer id);

    List<Personaje> personajeOrdenadoMenorPrecio();

    List<Personaje> personajeOrdenadoMayorPrecio();

    List<Personaje> personajeOrdenadoAlfabeticamente();
}
