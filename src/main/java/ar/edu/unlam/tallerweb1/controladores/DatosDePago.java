package ar.edu.unlam.tallerweb1.controladores;

import java.util.Date;

public class DatosDePago {

    private Long numTarjeta;
    private String nombreTitular;
    private Date mes;
    private Date anio;
    private Integer cvv;
    private String montoElegido;

    public String getMontoElegido() {
        return montoElegido;
    }

    public void setMontoElegido(String montoElegido) {
        this.montoElegido = montoElegido;
    }

    public Long getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(Long numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public Date getMes() {
        return mes;
    }

    public void setMes(Date mes) {
        this.mes = mes;
    }

    public Date getAnio() {
        return anio;
    }

    public void setAnio(Date anio) {
        this.anio = anio;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }
}
