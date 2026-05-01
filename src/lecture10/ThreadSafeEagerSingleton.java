package lecture10;

public class ThreadSafeEagerSingleton {
    private static ThreadSafeEagerSingleton instance=new ThreadSafeEagerSingleton();

    //means before main function is executed the object will be created because we used static and meta space static  are created first ane then  main is run
    //threads will come but object is created and after main is rum threads will come
    private ThreadSafeEagerSingleton(){
        System.out.println("Singleton class is made");
    }
    public static ThreadSafeEagerSingleton getInstance(){
        return instance;
    }


}
