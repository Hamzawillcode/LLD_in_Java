package notificationengine;

public class TimeStampDecorator extends INotificationDecorator{
    public TimeStampDecorator(INotification no) {
        super(no);
    }
    public String getContent(){
        return "[2025-04-13 14:22:00] "+no.getContent();
    }
}
