package Ejercicio2;

public class EmailNotification extends Notification{
    public EmailNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public void send() {
        System.out.println("Enviando email a " + recipient + " : " + message);
    }
}
