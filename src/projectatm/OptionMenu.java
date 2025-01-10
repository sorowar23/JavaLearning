package projectatm;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account{
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    HashMap<Integer, Integer> data = new HashMap<>();

    public void getLogin(){
        int x =1;
        do{
            try {
                data.put(95501, 19190);
                data.put(95592, 19191);
                System.out.println("Enter your customer Number:");
                setCustomerNumber(menuInput.nextInt());
                System.out.println("Enter your PIN Number:");
                setPinNumber(menuInput.nextInt());
            }catch(Exception e){
                System.out.println("Invalid Character's. Only Numbers");
                x = 2;
            }
            int cn = getCustomerNumber();
            int pn = getPinNumber();

            if(data.containsKey(cn) && data.get(cn) == pn){
                getAccountType();
            }else{
                System.out.println("Wrong customer number or Pin Number Entered.");
            }

        }while(x == 1);
    }
    public void getAccountType(){
        System.out.println("Select the account you want to Access: ");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Savings Account");
        System.out.println("Type 3 - Exit");

        int selection = menuInput.nextInt();

        switch(selection){
            case 1:
                getChecking();
                break;
            case 2:
                getSavings();
                break;
            case 3:
                System.out.println("Thanks for using this ATM. see you next time. bye.");
                break;
            default:
                System.out.println("Invalid Choice.");
                getAccountType();

        }
    }
    public void getChecking(){
        System.out.println("Checking Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");

        int selection = menuInput.nextInt();
        switch (selection){
            case 1:
                System.out.println("Checking Account Balance: "+moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;
            case 2:
                getCheckingWithDrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thanks for using this ATM. See you next time, Bye.");
                break;
            default:
                System.out.println("Invalid Choice.");
                getChecking();
        }
    }
    public void getSavings() {
        System.out.println("Savings Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");

        int selection = menuInput.nextInt();
        switch (selection){
            case 1:
                System.out.println("Savings Account Balance: "+moneyFormat.format(getSavingsBalance()));
                getAccountType();
                break;
            case 2:
                getSavingsWithDrawInput();
                getAccountType();
                break;
            case 3:
                getSavingsDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thanks for using this ATM. See you next time, Bye.");
                break;
            default:
                System.out.println("Invalid Choice.");
                getSavings();
        }
    }
}
