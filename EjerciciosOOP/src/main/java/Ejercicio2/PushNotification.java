package Ejercicio2;

public class PushNotification extends Notification{
    public PushNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public void send() {
        System.out.println("Enviando notificación a " + recipient + " : " + message);
    }
}
