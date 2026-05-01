package zomato.factories;
import zomato.models.*;
import zomato.strategies.PaymentStrategy;
import java.util.List;

public interface OrderFactory {
    Order createOrder(User user, Cart cart, PaymentStrategy ps,Restaurant restaurant,double totalCost,String orderType,List<MenuItem> items);
}
