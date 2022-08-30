package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.controladores.DatosRegistro;
import ar.edu.unlam.tallerweb1.modelo.Coleccion;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioColeccion;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioRegistro;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ServicioRegistro")
@Transactional
public class ServicioRegistroImpl implements ServicioRegistro {

    private RepositorioRegistro repositorioRegistro;
    private RepositorioUsuario repoUsuario;
    private RepositorioColeccion repoColeccion;

    @Autowired
    public ServicioRegistroImpl(RepositorioRegistro repositorioRegistro, RepositorioUsuario repoUsuario, RepositorioColeccion repoColeccion){
        this.repositorioRegistro = repositorioRegistro;
        this.repoUsuario = repoUsuario;
        this.repoColeccion = repoColeccion;
    }

    @Override
    public void addUsuario(DatosRegistro datosRegistro){
        Usuario usuario = new Usuario();
//        usuario.setId(datosRegistro.getId());
        usuario.setEmail(datosRegistro.getEmail());
        usuario.setPassword(datosRegistro.getPassword());
        usuario.setActivo(datosRegistro.getActivo());

        repositorioRegistro.guardar(usuario);

    }

    @Override
    public Usuario consultarUsuarioPorEmail(String email) {
        return repositorioRegistro.buscarUsuarioPorEmail(email);
    }

    @Override
    public void agregarBilletera(Usuario usuario) {
        repoUsuario.agregarBilletera(usuario);
    }

    @Override
    public void creacionDeColeccion(Usuario usuario) {
        repoUsuario.creacionDeColeccion(usuario);
    }


}
