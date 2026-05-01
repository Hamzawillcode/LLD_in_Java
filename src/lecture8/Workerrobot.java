package lecture8;

public class Workerrobot extends Robot{
    public Workerrobot(Flyable f, Talkable t, Walkable w) {
        super(f, t, w);
    }

    @Override
    public void projection() {
        System.out.println("Displaying worker efficienc stats....");
    }
}
