import java.util.HashMap;
import java.util.Map;

public class ATMOperationsImp implements ATMOperationsInterf{

    ATM atm = new ATM();

    Map<Double, String> ministatement = new HashMap();
    @Override
    public void viewBalance() {
        System.out.println("Available balance is: " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount % 20 == 0) {
            if (withdrawAmount <= atm.getBalance()) {
                ministatement.put(withdrawAmount, "Amount withdrawn");
                System.out.println("Collect your cash " + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient balance.");
            }
        }
        else {
            System.out.println("Please enter amount in multiples of 20.");
        }

    }

    @Override
    public void depositAmount(double depositAmount) {
        ministatement.put(depositAmount, "Amount deposited");
        System.out.println(depositAmount + " successfully deposited");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        for(Map.Entry<Double, String> m: ministatement.entrySet()){
            System.out.println(m.getValue() + " " + m.getKey());
        }
        viewBalance();
    }
}
