package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Coleccion;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioColeccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("servicioColeccion")
@Transactional
public class ServicioColeccionImpl implements ServicioColeccion{

    private RepositorioColeccion repoColeccion;

    @Autowired
    public ServicioColeccionImpl(RepositorioColeccion repoColeccion){
        this.repoColeccion = repoColeccion;
    }

    @Override
    public Coleccion traerColeccion(Usuario user) {
        return repoColeccion.traerColeccion(user);
    }

    @Override
    public void modificar(Coleccion coleccion){
        repoColeccion.modificar(coleccion);
    }
}
