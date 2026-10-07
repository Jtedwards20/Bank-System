//Jeffrey Edwards, business savings for bank

public class BusinessSavings extends BankAccount {

    //constructor
    public BusinessSavings(String accountName, double currentBalance, String address, String emailAddress, String phone){
        super(accountName, currentBalance, address, emailAddress, phone);
        accountType = "Business Savings";
    }

    //withdraw with BS stipulations
    @Override
    public void withdraw(double money){
        currentBalance = currentBalance - money - 10;
    }

    //monthly fee BS stipulations
    @Override
    public void monthlyFee(){
        currentBalance -= 20;
    }

    //interest method
    @Override
    public void addInterest(){
        currentBalance = currentBalance * 0.025 + currentBalance;
    }
}
