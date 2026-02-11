package Ariane05149_IcanCode;
import Ariane05149_IcanCode.EmailNotification;
import Ariane05149_IcanCode.NotificationService;
import Ariane05149_IcanCode.PushNotification;
import Ariane05149_IcanCode.SMSNotification;
public class Main {
    public static void main(String[] args) {
        NotificationService emailNot = new EmailNotification();
        emailNot.SendNotification("Welcome to the Notification system!");

        NotificationService smsNot = new SMSNotification();
        smsNot.SendNotification("Meeting reminder!");

        NotificationService pushNot = new PushNotification("ArianePhone01");
        pushNot.SendNotification("New message received!");
        pushNot.setDefaultPriority("High");
        emailNot.setDefaultPriority("Normal");


        }
    }
