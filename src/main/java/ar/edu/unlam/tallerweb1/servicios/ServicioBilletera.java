package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Billetera;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

public interface ServicioBilletera {
    public Billetera traerDatosBilletera(Usuario user);
}
