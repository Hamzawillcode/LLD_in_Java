package lecture6;

public class AdminUser extends User{
    //PassWord must be 6 characters long

    @Override
    public void setPassword(String pass) {
        if (pass.length() < 6) {
            throw new IllegalArgumentException("Password must be at least 6 characters long!");
        }
        System.out.println("Password set successfully");
    }
}
