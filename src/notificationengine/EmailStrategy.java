package notificationengine;

public class EmailStrategy implements NotificationStrategy{
    String emailId;

    public EmailStrategy(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public void sendNotification(String content) {
        System.out.println("Sending email Notification to: " + emailId + "\n" + content);
    }
}
