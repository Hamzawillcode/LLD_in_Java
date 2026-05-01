package notificationengine;

public class NotificationSystem {
    static void main() {
        NotificationService notificationService = NotificationService.getInstance();
        NotificationEngine notificationEngine = new NotificationEngine();

        notificationEngine.addNotificationStrategy(new EmailStrategy("princi@gmail.com"));
        notificationEngine.addNotificationStrategy(new SMSStrategy("+917880356708"));
        INotification notification = new SimpleNotification("Your order has been shipped!");
        notification = new TimeStampDecorator(notification);
        notification = new SignatureDecorator(notification, "Customer Care");

        notificationService.sendNotification(notification);
    }
}
