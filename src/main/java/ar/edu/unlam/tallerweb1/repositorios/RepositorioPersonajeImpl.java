package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.Coleccion;
import ar.edu.unlam.tallerweb1.modelo.Personaje;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Properties;

@Repository("repositorioPersonaje")
public class RepositorioPersonajeImpl implements RepositorioPersonaje {

    private SessionFactory sessionFactory;

    @Autowired
    public RepositorioPersonajeImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Personaje> listaDePersonajes(){
        List<Personaje> personajes = sessionFactory.getCurrentSession().createCriteria(Personaje.class)
                .list();
        return personajes;
    }

    @Override
    public List<Personaje> listaDePersonajesEnVenta(){
        List<Personaje> personajes = sessionFactory.getCurrentSession().createCriteria(Personaje.class)
                .add(Restrictions.eq("enVenta", true))
                .list();
        return personajes;
    }

    @Override
    public List<Personaje> listaDePersonajesEnMiColeccion(){
        List<Personaje> personajes = sessionFactory.getCurrentSession().createCriteria(Personaje.class)
                .add(Restrictions.eq("enMiColeccion", true))
                .list();
        return personajes;
    }

    @Override
    public Personaje buscarPorId(Integer id){
        Personaje personaje = (Personaje) sessionFactory.getCurrentSession().createCriteria(Personaje.class)
                .add(Restrictions.eq("id", id))
                .uniqueResult();
        return personaje;
    }

    @Override
    public Integer maxId(){
        Criteria consulta = sessionFactory.getCurrentSession().createCriteria(Personaje.class)
                .setProjection(Projections.max("id"));

        Integer idMax = (Integer) consulta.uniqueResult();
        return idMax;
    }

    @Override
    public void modificar(Personaje personaje) {
        sessionFactory.getCurrentSession().update(personaje);
    }

    @Override
    public List<Personaje> listaDePersonajesEnMiColeccion(Coleccion coleccion){
        List <Personaje> personajesEnMiColeccion = sessionFactory.getCurrentSession().createCriteria(Personaje.class)
                .createAlias("coleccion", "c")
                .add(Restrictions.eq("c.id", coleccion.getId()))
                .list();

        return personajesEnMiColeccion;
    }

    @Override
    public void eliminarPersonaje(Integer id) {
        Personaje personaje = buscarPorId(id);
        sessionFactory.getCurrentSession().delete(personaje);
    }
}
