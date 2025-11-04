package Ejercicio2;

public class SmsNotification extends Notification{
    public SmsNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public void send() {
        System.out.println("Enviando SMS a " + recipient + " : " + message);
    }
}
