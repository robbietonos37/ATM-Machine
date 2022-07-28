import java.sql.SQLOutput;
import java.util.Scanner;

public class MainMethodClass {

    public static void main(String[] args){
        ATMOperationsInterf user = new ATMOperationsImp();
        int atmnumber = 12345;
        int atmPIN = 1234;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ATM number: ");
        int atmNumber = scan.nextInt();
        System.out.println("Enter Pin: ");
        int pin = scan.nextInt();
        if((atmNumber == atmnumber) && (pin == atmPIN)){
            while(true){
                System.out.println("1. View Available Balance\n2.Withdraw Money\n3.Deposit Money" +
                        "\n4.View MiniStatement\n5.Exit");
                System.out.println("Please Enter An Option: ");
                int choice = scan.nextInt();
                if(choice == 1){
                    user.viewBalance();
                }
                else if(choice == 2){
                    System.out.println("Enter an amount to withdraw: ");
                    double withdrawAmount = scan.nextDouble();
                    user.withdrawAmount(withdrawAmount);
                }
                else if(choice == 3){
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = scan.nextDouble();
                    user.depositAmount(depositAmount);
                }
                else if(choice == 4){
                    user.viewMiniStatement();

                }
                else if(choice == 5){
                    System.out.println("Thank you for your business.\nPlease collect your card");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Please enter a correct choice.");
                }
            }
        }
        else{
            System.out.println("Invalid ATM Number or Pin. Please Try Again");
        }

    }
}
