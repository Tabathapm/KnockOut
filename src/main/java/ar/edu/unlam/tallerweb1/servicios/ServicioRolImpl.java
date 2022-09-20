package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Rol;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioRol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("servicioRol")
@Transactional
public class ServicioRolImpl implements ServicioRol {

    private RepositorioRol repoRol;

    @Autowired
    public ServicioRolImpl(RepositorioRol repoRol){
        this.repoRol = repoRol;
    }

    @Override
    public Rol obtenerRolUser() {
        return repoRol.obtenerRolUsuario();
    }
}
