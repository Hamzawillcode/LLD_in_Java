package lecture5;

public class ShoppingCartStorage {
    ShoppingCart cart;

    public ShoppingCartStorage(ShoppingCart cart) {
        this.cart = cart;
    }
    public void saveToDatabase(){
        System.out.println("Saving to Storage");
    }
}
