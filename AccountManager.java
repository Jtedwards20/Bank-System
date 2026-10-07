//Class that will build an array to manage all bank account types

import java.util.Arrays;

public class AccountManager {
    BankAccount[] Accounts;
    int size;

    //constructor for account manager
    public AccountManager(){
        this.Accounts = new BankAccount[5];
        size = 0;
    }

    //creation and adding of new bank account
    public void newAccount(BankAccount account){
        Accounts[size] = account;
        size++;
        if(size == Accounts.length){
            Accounts = Arrays.copyOf(Accounts, Accounts.length * 5);
        }
    }

    //cycles through array and executes monthly-fee method
    public void applyFee(){
        for (int i = 0; i < size; i++){
            Accounts[i].monthlyFee();
        }
    }

    //cycles through array and executes add-interest method
    public void addInterest(){
        for (int i = 0; i < size; i++){
            Accounts[i].addInterest();
        }
    }

    //search function
    public BankAccount findAccount(int accountNum){
        for (int i = 0; i < size; i++){
            if (Accounts[i].getAccountNum() == accountNum){
                return Accounts[i];
            }
        }
        return null;
    }

    //print array
    public void printArray(){
        for (BankAccount account : Accounts){
            if (account == null){
                return;
            }else {
                System.out.println(account);
                System.out.println();
            }
        }
    }
}
