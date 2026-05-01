package lecture12;



public class ObserverDesignPattern {
    static void main() {
        Channel channel=new Channel("Flying Beast");
        channel.subscribe(new Subscriber(channel,"Hamza"));
        channel.subscribe(new Subscriber(channel,"Princi"));
        channel.uploadVideo("My Daily routine of the day");
    }
}
