package Ariane05149_IcanCode;

public class EmailNotification implements NotificationService {
    @Override
    public void SendNotification(String message) {
        System.out.println("Sending Email notification:" + message);
    }
}

