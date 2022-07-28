package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.controladores.DatosRegistro;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ServicioRegistro")
@Transactional
public class ServicioRegistroImpl implements ServicioRegistro {

    private RepositorioRegistro repositorioRegistro;

    @Autowired
    public ServicioRegistroImpl(RepositorioRegistro repositorioRegistro){
        this.repositorioRegistro = repositorioRegistro;
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


}
