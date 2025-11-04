package Ejercicio2;

import java.util.List;

public class NotificationService {
    public void sendBatch(List<Notification> notifications) {
        for (Notification notification : notifications) {
            notification.send();
        }
    }
}
