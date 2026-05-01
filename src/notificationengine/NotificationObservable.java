package notificationengine;

import java.util.ArrayList;
import java.util.List;

public class NotificationObservable implements IObservable{
    List<IObserver> observers=new ArrayList<>();
    INotification currentnotification=null;
    @Override
    public void addObserver(IObserver ov) {
        observers.add(ov);
    }

    @Override
    public void remove(IObserver ov) {
        observers.remove(ov);
    }
    public void notifyObservers(){
        for(IObserver ob:observers){
            ob.update();
        }
    }
    public void setNotification(INotification no){
        this.currentnotification=no;
        notifyObservers();
    }
    public String getNotification(){
        return currentnotification.getContent();
    }
}

