package lecture9.simpleFactory;

public class StandardBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("I am a standard burger");
    }
}
