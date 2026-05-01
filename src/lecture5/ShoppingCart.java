package lecture5;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> cartitems;

    public ShoppingCart() {
        this.cartitems = new ArrayList<>();
    }
    public void additem(Product item){
        cartitems.add(item);
    }
    public List<Product> getitems(){
        return cartitems;
    }
    public long cart_total_price(){
        if(cartitems.size()==0){
            return 0;
        }
        int sum=0;
        for(Product item:cartitems){
            sum+=item.price;
        }
        return sum;
    }
}
