package lecture9.factoryMethod;



public class FactoryMethod {
    static void main() {
        String type="Basic";
        BurgerFactory myfactory= new BurgerKing();
        Burger burger=myfactory.createBurger(type);
        if(burger!=null){
            burger.prepare();
        }
    }
}
