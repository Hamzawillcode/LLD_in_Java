package lecture5;

public class Current_Acc implements Withdrawl_Acc{
    long balance;

    public Current_Acc() {
        this.balance =0;
    }

    @Override
    public void withdraw(long wamount) {
        balance-=wamount;
        System.out.println("Rupees " + wamount +" withdrawn and your new balance is "+balance);
    }
    @Override
    public void deposit(long amount) {
        balance+=amount;
        System.out.println("Rupees " + amount +" deposited and your new balance is "+balance);
    }
}
