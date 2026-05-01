package zomato;

import zomato.managers.RestaurantManager;
import zomato.models.*;

import java.util.List;


public class ZomatoApp {
    public ZomatoApp(){
        initializeRestaurants();
    }
    public void initializeRestaurants() {
        Restaurant restaurant1 = new Restaurant("Bikaner", "Delhi");
        restaurant1.addMenuItem(new MenuItem("P1", "Chole Bhature", 120));
        restaurant1.addMenuItem(new MenuItem("P2", "Samosa", 15));

        Restaurant restaurant2 = new Restaurant("Haldiram", "Kolkata");
        restaurant2.addMenuItem(new MenuItem("P1", "Raj Kachori", 80));
        restaurant2.addMenuItem(new MenuItem("P2", "Pav Bhaji", 100));
        restaurant2.addMenuItem(new MenuItem("P3", "Dhokla", 50));

        Restaurant restaurant3 = new Restaurant("Saravana Bhavan", "Chennai");
        restaurant3.addMenuItem(new MenuItem("P1", "Masala Dosa", 90));
        restaurant3.addMenuItem(new MenuItem("P2", "Idli Vada", 60));
        restaurant3.addMenuItem(new MenuItem("P3", "Filter Coffee", 30));

        RestaurantManager restaurantManager = RestaurantManager.getInstance();
        restaurantManager.addRestaurant(restaurant1);
        restaurantManager.addRestaurant(restaurant2);
        restaurantManager.addRestaurant(restaurant3);
    }
    public List<Restaurant> getRestaurants(String location){
        return RestaurantManager.getInstance().searchByLocation(location);
    }
    public void selectRestaurant(User user,Restaurant restaurant){
        Cart cart=user.getCart();
        cart.setRes(restaurant);
    }
    public void addToCart(User user,String itemCode){
        Restaurant restaurant=user.getCart().getRes();
        if(restaurant==null){
            System.out.println("please choose restaurant");
        }
        for(MenuItem item:restaurant.getMenu()){
            if(item.getId().equals(itemCode)){
                user.addItemInCart(item);
                break;
            }
        }
    }
    
}
