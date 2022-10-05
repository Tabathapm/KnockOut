package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.Coleccion;
import ar.edu.unlam.tallerweb1.modelo.Personaje;

import java.util.List;

public interface RepositorioPersonaje {

    List<Personaje> listaDePersonajes();
    List<Personaje> listaDePersonajesEnVenta();
    List<Personaje> listaDePersonajesEnMiColeccion();
    Personaje buscarPorId(Integer id);
    public Integer maxId();
    void modificar(Personaje personaje);
    List<Personaje> listaDePersonajesEnMiColeccion(Coleccion coleccion);

    void eliminarPersonaje(Integer id);
}
