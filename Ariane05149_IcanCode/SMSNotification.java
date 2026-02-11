package Ariane05149_IcanCode;

public class SMSNotification implements NotificationService{
    @Override
    public void SendNotification(String message) {
        System.out.println("Sending SMS Notification:"+message);

    }
}
