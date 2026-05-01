package zomato.strategies;
import zomato.ZomatoApp;
import zomato.models.*;
public class Main {
    static void main() {
        ZomatoApp zomato=new ZomatoApp();
        User user1=new User("Allahabad","Hamza",1);
        System.out.println("User: " + user1.getName() + " is active.");

    }
}
