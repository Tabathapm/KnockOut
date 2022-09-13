package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Billetera;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioBilletera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("servicioBilletera")
@Transactional
public class ServicioBilleteraImpl implements ServicioBilletera{
    private RepositorioBilletera repoBilletera;

    @Autowired
    public ServicioBilleteraImpl(RepositorioBilletera repoBilletera){
        this.repoBilletera = repoBilletera;
    }

    @Override
    public Billetera traerDatosBilletera(Usuario user) {
        return repoBilletera.traerDatosBilletera(user);
    }

    @Override
    public void agregarBilletera(Usuario usuario) {
        repoBilletera.agregarBilletera(usuario);
    }

    @Override
    public void modificar(Billetera billetera) {
        repoBilletera.modificar(billetera);
    }
}
