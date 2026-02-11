package Ariane05149_IcanCode;

public class PushNotification implements NotificationService {
    private String deviceId;
    public PushNotification(String deviceId){
        this.deviceId=deviceId;
    }
    @Override
    public void SendNotification(String message) {
        System.out.println("sending Push Notification to " + deviceId+ ":" + message);
    }



}

