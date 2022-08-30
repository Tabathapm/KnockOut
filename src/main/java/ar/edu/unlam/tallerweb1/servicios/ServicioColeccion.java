package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Coleccion;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

public interface ServicioColeccion {
    public Coleccion traerColeccion(Usuario user);
    void modificar(Coleccion coleccion);
}
