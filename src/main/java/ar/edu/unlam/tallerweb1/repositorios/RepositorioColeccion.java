package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.Coleccion;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

public interface RepositorioColeccion {

    public Coleccion traerColeccion(Usuario user);
    void modificar(Coleccion coleccion);
}
