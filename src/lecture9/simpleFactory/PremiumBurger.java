package lecture9.simpleFactory;

public class PremiumBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("I am a Premium Burger");
    }
}
