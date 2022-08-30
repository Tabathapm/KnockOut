package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.controladores.DatosRegistro;
import ar.edu.unlam.tallerweb1.modelo.Coleccion;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

public interface ServicioRegistro {
    void addUsuario(DatosRegistro datosRegistro);
    Usuario consultarUsuarioPorEmail(String email);
    void agregarBilletera(Usuario usuario);
    void creacionDeColeccion(Usuario usuario);

}
