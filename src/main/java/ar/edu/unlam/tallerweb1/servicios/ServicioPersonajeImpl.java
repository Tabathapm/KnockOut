package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Personaje;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioPersonaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("servicioPersonaje")
@Transactional
public class ServicioPersonajeImpl implements ServicioPersonaje {

    private RepositorioPersonaje repoPersonaje;

    @Autowired
    public ServicioPersonajeImpl(RepositorioPersonaje repoPersonaje){
        this.repoPersonaje = repoPersonaje;
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
}
