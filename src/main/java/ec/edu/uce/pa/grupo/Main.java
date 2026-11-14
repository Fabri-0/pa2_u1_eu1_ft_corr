package ec.edu.uce.pa.grupo;

import ec.edu.uce.pa.grupo.extensiones.DescuentoVIP;
import ec.edu.uce.pa.grupo.extensiones.DescuentoNormal;
import ec.edu.uce.pa.grupo.extensiones.DescuentoTerceraEdad;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject 
    private DescuentoNormal descuentoNormal;

    @Inject 
    private DescuentoVIP descuentiVIP;

    @Inject 
    private DescuentoTerceraEdad descuentoTerceraEdad;


    @Inject 
    private PedidoService pedidoService;
    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        
        Pedido pedido1 = new Pedido("P001", "Leche", 10.0);
        Pedido pedido2 = new Pedido("P002", "Jamon", 20.0);
        Pedido pedido3 = new Pedido("P003", "Arroz", 50.0);

        pedidoService.procesarPedido(pedido1, descuentoNormal);
        pedidoService.procesarPedido(pedido2, descuentiVIP);
        pedidoService.procesarPedido(pedido3, descuentoTerceraEdad);

        return 0;
    }

}
