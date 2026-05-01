package lecture12;

import java.util.ArrayList;
import java.util.List;

public class Channel implements IChannel {
    List<ISubscriber> subscribers;
    String name;
    String latestvideo;
    public Channel(String name){
        this.name=name;
        this.subscribers=new ArrayList<>();
    }
    @Override
    public void notifySubscribers() {
        for(ISubscriber sub:subscribers){
            sub.update();
        }
    }

    @Override
    public void subscribe(ISubscriber s) {
        subscribers.add(s);
    }

    @Override
    public void unsubscribe(ISubscriber s) {
        subscribers.remove(s);
    }
    public void uploadVideo(String title){
        this.latestvideo=title;
        notifySubscribers();
    }
    public String getVideo(){
       return  "Checkout our lates video "+ latestvideo +"\n";
    }
}
