package entities;

import java.util.Scanner;
public class AccontBank {
    private String accountHolder;
    private int numberAccount = 0;
    private double valueInAccount;


    public AccontBank(String name, int numberAccount, double initialValue ) {
        this.accountHolder = name;
        this.numberAccount = numberAccount;
        AddValue(initialValue);
    }

    public void AddValue(double deposit){
        this.valueInAccount +=  deposit;

    }

    public void RemoveValue(double withdraw){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("What is number account?");
        int res = sc1.nextInt();
        if (res == this.numberAccount){
            if (withdraw >= valueInAccount) {
                System.out.println("Value invalid");
            } else {
                this.valueInAccount = ((this.valueInAccount - withdraw) - 5.0);
            }
        } else {

            System.out.println("Error 405");
        }
        sc1.close();
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getInitialValue() {
        return valueInAccount;
    }


    @Override
    public String toString() {
        return " your number accont is "
                +numberAccount
                + " your name is "
                + accountHolder
                + " Value in account is: $"
                + valueInAccount;
    }
}
