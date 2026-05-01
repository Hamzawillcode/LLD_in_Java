package notificationengine;

import java.util.List;

public interface IObservable {

    void addObserver(IObserver ov);
    void remove(IObserver ov);
}
