package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Coleccion;
import ar.edu.unlam.tallerweb1.modelo.Personaje;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioColeccion;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioPersonaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("servicioPersonaje")
@Transactional
public class ServicioPersonajeImpl implements ServicioPersonaje {

    private RepositorioPersonaje repoPersonaje;
    private RepositorioColeccion repoColeccion;

    @Autowired
    public ServicioPersonajeImpl(RepositorioPersonaje repoPersonaje, RepositorioColeccion repoColeccion) {
        this.repoPersonaje = repoPersonaje;
        this.repoColeccion = repoColeccion;
    }

    @Override
    public List<Personaje> listaDePersonajes() {
        return repoPersonaje.listaDePersonajes();
    }

    @Override
    public List<Personaje> listaDePersonajesEnVenta() {
        return repoPersonaje.listaDePersonajesEnVenta();
    }

    @Override
    public List<Personaje> listaDePersonajesEnMiColeccion() {
        return repoPersonaje.listaDePersonajesEnMiColeccion();
    }

    @Override
    public Personaje buscarPorId(Integer id) {
        return repoPersonaje.buscarPorId(id);
    }

    @Override
    public Integer maxId() {
        return repoPersonaje.maxId();
    }

    @Override
    public void modificar(Personaje personaje) {
        repoPersonaje.modificar(personaje);
    }

    @Override
    public List<Personaje> listaDePersonajesEnMiColeccion(Coleccion coleccion) {
        return repoPersonaje.listaDePersonajesEnMiColeccion(coleccion);
    }

    @Override
    public Personaje traerPersonaje(Integer id) {
        return repoPersonaje.traerPersonaje(id);
    }

    @Override
    public List<Personaje> eliminarpersonaje(List<Personaje> listaPersonajes, Personaje personaje) {
        for (int i = 0; i < listaPersonajes.size(); i++) {
            if (listaPersonajes.get(i).getId().equals(personaje.getId())) {
                personaje.setEnMiColeccion(false);
                personaje.setEnVenta(true);
                listaPersonajes.remove(i);
            }
        }

        repoPersonaje.modificar(personaje);
        return listaPersonajes;
    }

    @Override
    public void eliminarPersonaje(Integer id) {
        repoPersonaje.eliminarPersonje(id);
    }

    @Override
    public List<Personaje> personajeOrdenadoMenorPrecio() {
        return repoPersonaje.personajeOrdenadoMenorPrecio();
    }

    @Override
    public List<Personaje> personajeOrdenadoMayorPrecio() {
        return repoPersonaje.personajeOrdenadoMayorPrecio();
    }

    @Override
    public List<Personaje> personajeOrdenadoAlfabeticamente() {
        return repoPersonaje.personajeOrdenadoAlfabeticamente();
    }

}
