package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.Exceptions.MontoInsuficienteException;
import ar.edu.unlam.tallerweb1.modelo.Billetera;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioBilletera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.math.RoundingMode;

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

    @Override
    public void restarDinero(Billetera billetera, Float monto) {
        if(billetera.getMonto() >= monto) {
            repoBilletera.restarDinero(billetera,monto);
        }else{
            throw new MontoInsuficienteException();
        }

    }

    @Override
    public void sumarMonto(Billetera billetera, Float monto) {
        Float montoVenta = monto - (monto * 0.2f);
        repoBilletera.sumarMonto(billetera,montoVenta);
    }

    @Override
    public Float limitarDecimales(Billetera billetera) {
        BigDecimal formatNumber = new BigDecimal(billetera.getMonto());
        billetera.setMonto(formatNumber.setScale(2, RoundingMode.HALF_UP).floatValue());
        return billetera.getMonto();
    }


}
