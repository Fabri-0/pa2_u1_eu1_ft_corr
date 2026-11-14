package ec.edu.uce.pa.grupo.extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class DescuentoVIP implements  Descuento {

    @Override
    public double calcularDescuento(double precio) {
        double descuento = precio * 0.01;
        return precio - descuento;
    }

}
