package lecture8;

public class CompanionRobot extends Robot{
    public CompanionRobot(Flyable f, Talkable t, Walkable w) {
        super(f, t, w);
    }

    @Override
    public void projection() {
        System.out.println("Displaying Companion features...");
    }
}
