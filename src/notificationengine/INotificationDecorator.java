package notificationengine;

public abstract class INotificationDecorator implements INotification {
    protected INotification no;

    public INotificationDecorator(INotification no) {
        this.no = no;
    }

}
