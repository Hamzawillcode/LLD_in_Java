package zomato.models;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private Restaurant res;
    private List<MenuItem> items=new ArrayList<>();
    public Cart(){
        res=null;
    }

    public void additem(MenuItem item){
        if(res==null){
            System.err.println("Cart: Set a restaurant before adding items.");
            return;
        }
        items.add(item);
    }
    public double getTotalCost(){
        double sum=0;
        for (MenuItem it : items) {
            sum += it.getPrice();
        }
        return sum;
    }
    public Restaurant getRes() {
        return res;
    }

    public void setRes(Restaurant res) {
        this.res = res;
    }
}
