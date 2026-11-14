package ec.edu.uce.pa.grupo;

import jakarta.inject.Singleton;

@Singleton
public class NotificacionMailService {

    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando notificación: " + mensaje);
    }
}
