package zomato.factories;

import zomato.models.*;
import zomato.strategies.PaymentStrategy;

import java.util.List;

public class ScheduleOrderFactory implements OrderFactory{
    String scheduleTime;

    public ScheduleOrderFactory(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    @Override
    public Order createOrder(User user, Cart cart, PaymentStrategy ps, Restaurant restaurant, double totalCost, String orderType, List<MenuItem> items) {
        Order order=null;
        if(orderType.equals("Delivery")){
            DeliveryOrder deliveryorder=new DeliveryOrder();
            deliveryorder.setUserAddress(user.getAddress());
            order=deliveryorder;
        }
        else{
            PickUpOrder pickOrder=new PickUpOrder();
            pickOrder.setRestaurantAddress(restaurant.getLocation());
            order =pickOrder;
        }
        order.setScheduled(scheduleTime);
        order.setItems(items);
        order.setUser(user);
        order.setPaymentStrategy(ps);
        order.setTotal(totalCost);
        order.setRestaurant(restaurant);
        return order;
    }
}
