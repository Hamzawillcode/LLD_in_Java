package lecture5;

import java.util.ArrayList;

public class LSPFollowed {
    static void main() {
        ArrayList<Withdrawl_Acc> wal=new ArrayList<>();
        wal.add(new Savings_Acc());
        wal.add(new Current_Acc());
        ArrayList<Non_Withdrawl_Acc> nwl=new ArrayList<>();
        nwl.add(new Fixed_Deposit_Acc());
        BankClient client=new BankClient(nwl,wal);
        client.processTransactions();
    }

}
