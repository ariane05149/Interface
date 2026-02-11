package Ariane05149_IcanCode;

public interface NotificationService {
    void SendNotification(String message);
    default  void setDefaultPriority(String priority){
        System.out.println("Default priority is set to :"+priority);

    }
}
