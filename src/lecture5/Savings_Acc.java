package lecture5;

public class Savings_Acc implements Withdrawl_Acc{
    long balance;

    public Savings_Acc() {
        this.balance = 0;
    }

    @Override
    public void withdraw(long wamount) {
        if(balance<=0){
            System.out.println("Insufficient balance");
            return;
        }
        balance-=wamount;
        System.out.println("Rupees " +wamount +" withdrawn and your new balance is "+balance);
    }

    @Override
    public void deposit(long amount) {
        balance+=amount;
        System.out.println("Rupees " + amount +" deposited and your new balance is "+balance);
    }
}
