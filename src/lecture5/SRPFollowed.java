package lecture5;
import java.util.*;
public class SRPFollowed {
    static void main() {
       ShoppingCart cart=new ShoppingCart();
       cart.additem(new Product(20,"Bisleri"));
       cart.additem(new Product(6000,"Earphones"));
        cart.additem(new Product(50000,"SmartPhone"));
        cart.additem(new Product(7000,"Chair"));
       InvoicePrinter printer=new InvoicePrinter(cart);
       printer.printInvoice();
        
    }
}
