package lecture12;

public class Subscriber implements ISubscriber{
    String name;
    Channel channel;

    public Subscriber(Channel channel, String name) {
        this.channel = channel;
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Hey "+ name +channel.getVideo() +" ");
    }
}
