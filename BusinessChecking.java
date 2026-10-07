//Jeffrey Edwards, business checking for bank

public class BusinessChecking extends BankAccount{

    //constructor
    public BusinessChecking(String accountName, double currentBalance, String address, String emailAddress, String phone){
        super(accountName, currentBalance, address, emailAddress, phone);
        accountType = "Business Checking";
    }

    //takes money from current balance
    @Override
    public void withdraw(double money){
        //if the with-draw is over a certain amount remove 10 dollars
        if(money >= 10000){
            currentBalance -= money - 10;
        }else{
            currentBalance -= money;
        }
    }

    //take out a monthly fee
    @Override
    public void monthlyFee(){
        currentBalance -= 20;
    }

}
