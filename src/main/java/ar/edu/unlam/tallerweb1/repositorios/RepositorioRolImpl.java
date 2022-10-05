package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.Nivel;
import ar.edu.unlam.tallerweb1.modelo.Rol;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("repositorioRol")
public class RepositorioRolImpl implements RepositorioRol{

    private SessionFactory sessionFactory;

    @Autowired
    public RepositorioRolImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Rol obtenerRolUsuario() {
        Integer id = 2;
        Rol rol = (Rol) sessionFactory.getCurrentSession().createCriteria(Rol.class)
                .add(Restrictions.eq("id",id))
                .uniqueResult();
        return rol;
    }
}
