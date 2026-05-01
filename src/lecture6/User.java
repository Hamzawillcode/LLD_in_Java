package lecture6;
public class User {
    //password should be atleast 8 characters long
    public void setPassword(String pass){
        if(pass.length()<8){
            throw new IllegalArgumentException("PassWord must be 8 characters long");
        }
        System.out.println("PassWord set successfully");
    }
}
