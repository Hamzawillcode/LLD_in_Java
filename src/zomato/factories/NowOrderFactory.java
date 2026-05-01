package zomato.factories;

import zomato.models.*;
import zomato.strategies.PaymentStrategy;
import java.util.*;

import java.util.List;

public class NowOrderFactory implements OrderFactory{
    @Override
    public Order createOrder(User user, Cart cart, PaymentStrategy ps, Restaurant restaurant, double totalCost, String orderType, List<MenuItem> items) {
        Order order=null;
        if(orderType.equals("Pickup")){
            PickUpOrder po=new PickUpOrder();
            po.setRestaurantAddress(restaurant.getLocation());

            order=po;
        }
        else{
            DeliveryOrder deliveryorder=new DeliveryOrder();
            deliveryorder.setUserAddress(user.getAddress());
            order =deliveryorder;
        }
        order.setTotal(totalCost);
        order.setUser(user);
        order.setPaymentStrategy(ps);
        order.setItems(items);
        order.setScheduled("10:20 AM");
        order.setRestaurant(restaurant);
        return order;
    }
}
