package lecture10;

public class SimpleSingleton {
    private static SimpleSingleton instance=null;//only this referance will be seen always because static

    private SimpleSingleton() {//private because it is been called in the same class
        System.out.println("New object created");
    }
    //static because this method should be seen always
    public static SimpleSingleton getInstance(){
        if(instance==null){
            instance= new SimpleSingleton();
        }
        return instance;
    }
}
