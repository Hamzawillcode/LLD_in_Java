package zomato.models;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    static private int nextresid=0;
    private int resid;
    private String name;
    private String location;
    private List<MenuItem> menu=new ArrayList<>();

    public Restaurant(String location, String name) {
        this.location = location;
        this.name = name;
        this.resid=++nextresid;
    }
    public void setlocatoin(String loc){
        location=loc;
    }
    public String getLocation(){
        return location;
    }
    public void addMenuItem(MenuItem item){
        menu.add(item);
    }
    public List<MenuItem> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
