package lecture5;
import java.util.*;
public class InvoicePrinter {
    ShoppingCart cart;
    public InvoicePrinter(ShoppingCart cart){
        this.cart=cart;
    }
    public void printInvoice(){
        if(cart.cart_total_price()==0){
            System.out.println("There is no Item in the Cart");
            return;
        }
        List<Product> items=cart.getitems();
        for(Product singleitem:items){
            System.out.println("Brand: "+singleitem.name + "Price is "+ singleitem.price );
        }
        System.out.println("Total amount is "+ cart.cart_total_price());
    }
}
