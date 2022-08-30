package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.controladores.DatosRegistro;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("servicioUsuario")
@Transactional
public class ServicioUsuarioImpl implements ServicioUsuario{

    private RepositorioUsuario repoUsuario;

    @Autowired
    public ServicioUsuarioImpl(RepositorioUsuario repoUsuario){
        this.repoUsuario = repoUsuario;
    }

    @Override
    public void registrarUsuario(DatosRegistro datosRegistro) {
        Usuario usuario = new Usuario();
//        usuario.setId(datosRegistro.getId());
        usuario.setEmail(datosRegistro.getEmail());
        usuario.setPassword(datosRegistro.getPassword());
        usuario.setActivo(datosRegistro.getActivo());

        repoUsuario.guardar(usuario);
    }

    @Override
    public Usuario buscarUsuario (String email, String password) {
        return repoUsuario.buscarUsuario(email, password);
    }
    @Override
    public Usuario consultarUsuarioPorEmail(String email) {
        return repoUsuario.buscarUsuarioPorEmail(email);
    }

}
