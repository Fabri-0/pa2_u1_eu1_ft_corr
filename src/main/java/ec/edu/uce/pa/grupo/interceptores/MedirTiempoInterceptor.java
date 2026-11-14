package ec.edu.uce.pa.grupo.interceptores;

import ec.edu.uce.pa.grupo.Pedido;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
@MedirTiempo
public class MedirTiempoInterceptor {

    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception {

        long tiempoInicio = System.currentTimeMillis();

        Object resultado = context.proceed();

        Object[] valores = context.getParameters();
        Pedido pedido = (Pedido) valores [0];

        long tiempoFin = System.currentTimeMillis();
        System.out.println("DURACION: " + pedido.getCodigo()+ " |"+  (tiempoFin - tiempoInicio) + " ms");

        return resultado;
    }
}
