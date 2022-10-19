package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String descripcion;
    private String imagen;
    private Float monto;
    private Boolean enVenta;
    private Boolean enMiColeccion;

    private Boolean intercambiable;

    @ManyToMany(mappedBy = "personajes", cascade = CascadeType.ALL)
    private List<Coleccion> coleccion;

    @ManyToMany
    private List<Caracteristica> caracteristica;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Caracteristica> getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(List<Caracteristica> caracteristica) {
        this.caracteristica = caracteristica;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public Boolean getEnVenta() {
        return enVenta;
    }

    public void setEnVenta(Boolean enVenta) {
        this.enVenta = enVenta;
    }

    public Boolean getEnMiColeccion() {
        return enMiColeccion;
    }

    public void setEnMiColeccion(Boolean enMiColeccion) {
        this.enMiColeccion = enMiColeccion;
    }

    public List<Coleccion> getColeccion() {
        return coleccion;
    }

    public void setColeccion(List<Coleccion> coleccion) {
        this.coleccion = coleccion;
    }

    public Boolean getIntercambiable() {
        return intercambiable;
    }

    public void setIntercambiable(Boolean intercambiable) {
        this.intercambiable = intercambiable;
    }
}
