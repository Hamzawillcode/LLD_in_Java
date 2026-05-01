package lecture10;

public class ThreadSafeDoubleLockingSingleton {
    private static ThreadSafeDoubleLockingSingleton instance=null;
    private ThreadSafeDoubleLockingSingleton(){
        System.out.println("Singleton class is created");
    }
    public static ThreadSafeDoubleLockingSingleton getInstance(){
        //using instance==null first because it generally more fast than checking lock so we are trying
        //threads dont ask for lock or no lock
        if(instance==null){
            //here instance ==null because what if threads got inside and again they create there own instance
            synchronized (ThreadSafeDoubleLockingSingleton.class){
                if(instance==null){
                    instance=new ThreadSafeDoubleLockingSingleton();
                }
            }
        }
        return instance;
    }
}
