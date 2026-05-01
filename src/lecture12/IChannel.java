package lecture12;

public interface IChannel {
    void subscribe(ISubscriber s);
    void unsubscribe(ISubscriber s);
    void notifySubscribers();
}
