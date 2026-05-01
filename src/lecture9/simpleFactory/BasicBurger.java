package lecture9.simpleFactory;

public class BasicBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("I am a Basic Burger");
    }
}
