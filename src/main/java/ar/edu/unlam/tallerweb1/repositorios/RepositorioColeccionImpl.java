package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.Coleccion;
import ar.edu.unlam.tallerweb1.modelo.Personaje;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("repositorioColeccion")
public class RepositorioColeccionImpl implements RepositorioColeccion{

    private SessionFactory sessionFactory;

    @Autowired
    public RepositorioColeccionImpl (SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Coleccion traerColeccion(Usuario user) {
        Coleccion coleccion = (Coleccion) sessionFactory.getCurrentSession().createCriteria(Coleccion.class)
                .add(Restrictions.eq("usuario", user))
                .uniqueResult();
        return coleccion;
    }

    @Override
    public void modificar(Coleccion coleccion) {
        sessionFactory.getCurrentSession().update(coleccion);
    }

    @Override
    public void creacionDeColeccion(Usuario usuario) {
        Coleccion coleccion = new Coleccion();
        coleccion.setUsuario(usuario);
        sessionFactory.getCurrentSession().save(coleccion);
    }

    @Override
    public Coleccion jugadorConMasPersonajes(){
        // devolver la colección con más personajes
        Coleccion coleccion = (Coleccion) sessionFactory.getCurrentSession().createCriteria(Coleccion.class)
                .addOrder(Order.desc("personajes"))
                .setMaxResults(1)
                .uniqueResult();

        return coleccion;
    }
}
