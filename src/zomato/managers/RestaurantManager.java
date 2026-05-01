package zomato.managers;
import zomato.models.*;
import java.util.*;
public class RestaurantManager {
    private static RestaurantManager instance=null;
    private List<Restaurant> restaurants = new ArrayList<>();
    private RestaurantManager(){

    }
    public static RestaurantManager getInstance(){
        if(instance==null){
            return new RestaurantManager();
        }
        return instance;
    }
    public void addRestaurant(Restaurant r){
        restaurants.add(r);
    }
    public List<Restaurant> searchByLocation(String location){
        List<Restaurant> ans=new ArrayList<>();
        for(Restaurant res:restaurants){
            if(res.getLocation()==location){
                ans.add(res);
            }
        }
        return ans;
    }

}
