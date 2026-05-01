package lecture10;

public class Main {
    static void main() {
        SimpleSingleton s1=SimpleSingleton.getInstance();
        SimpleSingleton s2=SimpleSingleton.getInstance();
        ThreadSafeDoubleLockingSingleton s3=ThreadSafeDoubleLockingSingleton.getInstance();
        ThreadSafeDoubleLockingSingleton s4=ThreadSafeDoubleLockingSingleton.getInstance();
        System.out.println(s3==s4);
    }
}
