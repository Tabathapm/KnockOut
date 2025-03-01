package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.Coleccion;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

import java.util.List;

// Interface que define los metodos del Repositorio de Usuarios.
public interface RepositorioUsuario {
	
	Usuario buscarUsuario(String email, String password);
	void guardar(Usuario usuario);
    Usuario buscar(String email);
	void modificar(Usuario usuario);
	Usuario buscarUsuarioPorEmail(String email);
	Usuario buscarPorID(Integer id);
	List<Usuario> getAll();

	Usuario jugadorConMasNivel();

	Usuario buscarUsuarioRolAdmin();
}
