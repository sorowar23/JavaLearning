package projectatm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0.00;
    private double savingsBalance = 0.00;
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public int getCustomerNumber() {
        return customerNumber;
    }


    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public int setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void getCheckingWithDrawInput(){
        System.out.println("called - getCheckingWithDrawInput()");
        System.out.println("Checking Account Balance:" + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from Checking Account:");
        double amount = input.nextDouble();
        if( (checkingBalance - amount) >= 0 ){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance: "+ moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Balance Cannot be Negative.");
        }
    }
    public void getSavingsWithDrawInput(){
        System.out.println("called - geSavingsWithDrawInput()");
        System.out.println("Savings Account Balance:" + moneyFormat.format(savingsBalance));
        System.out.println("Amount you want to withdraw from Savings Account:");
        double amount = input.nextDouble();
        if( (savingsBalance - amount) >= 0 ){
            calcSavingsWithdraw(amount);
            System.out.println("New Savings Account Balance: "+ moneyFormat.format(savingsBalance));
        }else{
            System.out.println("Balance Cannot be Negative.");
        }
    }
    public double calcCheckingDeposit(double amount){
        System.out.println("Called - calcCheckingDeposit()");
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;

    }
    public double calcSavingsDeposit(double amount){
        System.out.println("Called - calcSavingsDeposit()");
        savingsBalance = (savingsBalance + amount);
        return savingsBalance;
    }
    public double calcCheckingWithdraw(double amount){
        System.out.println("Called - calcCheckingWithdraw()");
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }
    public double calcSavingsWithdraw(double amount){
        System.out.println("Called - calcSavingsWithdraw()");
        savingsBalance = (savingsBalance - amount);
        return savingsBalance;
    }

    public void getCheckingDepositInput(){
        System.out.println("called - getCheckingDepositInput()");
        System.out.println("Checking Account Balance:" + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to Deposit form Checking Account: ");
        double amount  = input.nextDouble();

        if((checkingBalance + amount) >=0){
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account Balance: "+ moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Balance Cannot be Negative.");
        }
    }
    public void getSavingsDepositInput(){
        System.out.println("called - getSavingsDepositInput()");
        System.out.println("Checking Account Balance:" + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to Deposit form Checking Account: ");
        double amount  = input.nextDouble();

        if((savingsBalance + amount) >=0){
            calcSavingsDeposit(amount);
            System.out.println("New Savings Account Balance: "+ moneyFormat.format(savingsBalance));
        }else{
            System.out.println("Balance Cannot be Negative.");
        }
    }

}
