package notificationengine;
import java.util.*;
public class NotificationEngine implements IObserver{
    private NotificationObservable notificationObservable;
    private List<NotificationStrategy> notificationStrategies = new ArrayList<>();

    public NotificationEngine() {
        this.notificationObservable = NotificationService.getInstance().getObservable();
        notificationObservable.addObserver(this);
    }

    public NotificationEngine(NotificationObservable observable) {
        this.notificationObservable = observable;
    }

    public void addNotificationStrategy(NotificationStrategy ns) {
        this.notificationStrategies.add(ns);
    }

    // Can have RemoveNotificationStrategy as well.

    public void update() {
        String notificationContent = notificationObservable.getNotification();
        for (NotificationStrategy strategy : notificationStrategies) {
            strategy.sendNotification(notificationContent);
        }
    }
}
