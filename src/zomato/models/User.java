package zomato.models;

public class User {
    private int userId;
    private Cart cart;
    private String name;
    private String address;

    public User(String address, String name, int userId) {
        this.address = address;
        this.cart = new Cart();
        this.name = name;
        this.userId = userId;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return address;
    }
    public void addItemInCart(MenuItem item){
        cart.additem(item);
    }
    public Cart getCart(){
        return cart;
    }
}
