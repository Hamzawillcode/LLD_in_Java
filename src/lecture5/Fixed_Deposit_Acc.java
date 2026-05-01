package lecture5;

public class Fixed_Deposit_Acc implements Non_Withdrawl_Acc{
    long balance;

    public Fixed_Deposit_Acc() {
        this.balance = 0;
    }


    @Override
    public void deposit(long amount) {
        balance+=amount;
        System.out.println("Rupees " + amount +" deposited and your new balance is "+balance);
    }
}
