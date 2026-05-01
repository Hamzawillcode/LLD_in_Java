package lecture5;
import java.util.ArrayList;
import java.util.List;
public class BankClient {
    List<Non_Withdrawl_Acc> nw;
    List<Withdrawl_Acc> wa;

    public BankClient(List<Non_Withdrawl_Acc> nw, List<Withdrawl_Acc> wa) {
        this.nw = nw;
        this.wa = wa;
    }
    public void processTransactions(){
        for(Withdrawl_Acc account:wa){
            account.deposit(1000);
            account.withdraw(500);
        }
        for(Non_Withdrawl_Acc account:nw){
            account.deposit(5000);
        }
    }
}
