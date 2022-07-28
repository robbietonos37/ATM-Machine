public class ATM {

    private double balance;
    private double withdrawalAmount;
    private double depositAmount;


    //empty constructor
    public ATM(){

    }

    //setters

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setWithdrawalAmount(double withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public double getDepositAmount() {
        return depositAmount;
    }
}
