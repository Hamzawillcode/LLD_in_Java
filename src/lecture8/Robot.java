package lecture8;

abstract class Robot {
    protected Talkable t;
    protected Walkable w;
    protected Flyable f;

    public Robot(Flyable f, Talkable t, Walkable w) {
        this.f = f;
        this.t = t;
        this.w = w;
    }
    public void walk(){
        w.walk();
    }
    public void talk(){
        t.talk();
    }
    public void fly(){
        f.fly();
    }

    public abstract void projection();
}
