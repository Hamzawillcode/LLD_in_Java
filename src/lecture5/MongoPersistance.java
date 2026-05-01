package lecture5;

public class MongoPersistance implements Persistance{

    @Override
    public void save(ShoppingCart cart) {
        System.out.println("Saving shopping cart to a MongoDB");
    }
}
