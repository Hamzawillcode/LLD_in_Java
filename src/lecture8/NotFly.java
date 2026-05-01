package lecture8;

public class NotFly implements Flyable{
    @Override
    public void fly() {
        System.out.println("I cannot Fly");
    }
}
