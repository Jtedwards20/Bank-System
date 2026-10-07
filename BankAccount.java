//Jeffrey Edwards, this will be the top parent class for my bank account management project
import java.util.Random;
import java.util.LinkedList;

public class BankAccount {
    String accountName, address, emailAddress, phone, accountType;
    int accountNum;
    double currentBalance;
    //random number generator for account num
    Random rand = new Random();
    //stores account numbers, also used to prevent repeats
    LinkedList<Integer> SavedAccNums = new LinkedList<Integer>();

    //blank constructor
    public BankAccount(){
        do {
            accountNum = rand.nextInt(90000) + 10000;
        } while (SavedAccNums.contains(accountNum));
        SavedAccNums.add(accountNum);
    }

    //filled constructor
    public BankAccount(String accountName, double currentBalance, String address, String emailAddress, String phone){
        this.accountName = accountName;
        this.currentBalance = currentBalance;
        this.address = address;
        this.emailAddress = emailAddress;
        this.phone = phone;
        //creates unique account number
        do {
            accountNum = rand.nextInt(90000) + 10000;
        } while (SavedAccNums.contains(accountNum));
        SavedAccNums.add(accountNum);
    }

    //setters and getters
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName){
        this.accountName = accountName;
    }

    public int getAccountNum(){
        return accountNum;
    }

    public void setAccountNum(int accountNum){
        this.accountNum = accountNum;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String Address){
        this.address = address;
    }

    public String getEmailAddress(){
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(){
        this.phone = phone;
    }

    public double getCurrentBalance(){
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance){
        this.currentBalance = currentBalance;
    }

    public void setAccountType(String type){
        accountType = type;
    }

    public String getAccountType(){
        return accountType;
    }

    //adds money to current balance
    public void deposit(double money){
        currentBalance += money;
    }

    //takes money from current balance
    public void withdraw(double money){
        currentBalance -= money;
    }

    //takes monthly fee
    public void monthlyFee(){

    }

    //adds interest
    public void addInterest(){

    }

    @Override
    public String toString() {
        return "Account Type: " + accountType + "\nName: " + accountName + "\nAccount Number: " + accountNum +
                "\nCurrent Balance: " + currentBalance + "\nPhone Number: " + phone +
                "\nEmail Address: " + emailAddress;
    }
}
