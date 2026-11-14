package ec.edu.uce.pa.grupo.extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoNormal implements  Descuento {

    @Override
    public double calcularDescuento(double precio) {
        return precio;
    }

}
