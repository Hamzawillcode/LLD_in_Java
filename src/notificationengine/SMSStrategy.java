package notificationengine;

public class SMSStrategy implements NotificationStrategy{
    String number;
    public SMSStrategy(String number) {
        this.number=number;
    }
    @Override
    public void sendNotification(String content) {
        System.out.println("Sending SMS Notification to: " + number + "\n" + content);
    }
}
