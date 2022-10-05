package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Coleccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private Usuario usuario;

    @JoinTable(name = "coleccion_personaje", joinColumns = @JoinColumn(name = "fk_coleccion"), inverseJoinColumns = @JoinColumn(name = "fk_personaje"))
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Personaje> personajes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
    }
}
