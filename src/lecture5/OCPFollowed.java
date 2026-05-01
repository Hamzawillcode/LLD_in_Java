package lecture5;

public class OCPFollowed {
    static void main() {
        ShoppingCart cart=new ShoppingCart();
        cart.additem(new Product(50000, "Laptop"));
        cart.additem(new Product(2000, "Mobile"));
        InvoicePrinter printer =new InvoicePrinter(cart);
        printer.printInvoice();
        Persistance db=new SQLPersistance();
        Persistance mongo=new MongoPersistance();
        Persistance file=new FilePersistance();
        db.save(cart);    // Save to SQL database
        mongo.save(cart); // Save to MongoDB
        file.save(cart);  // Save to File
    }
}
