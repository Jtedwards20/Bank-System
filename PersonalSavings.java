//Jeffrey Edwards, Personal Savings for bank

public class PersonalSavings extends BankAccount {
    int withdraws = 0;

    public PersonalSavings(String accountName, double currentBalance, String address, String emailAddress, String phone){
        super(accountName, currentBalance, address, emailAddress, phone);
        accountType = "Personal Savings";
    }

    //settters and getters for withdraws
    public int getWithdraws(){
        return withdraws;
    }

    public void setWithdraws(int withdraws){
        this.withdraws = withdraws;
    }

    //withdraw for PS
    @Override
    public void withdraw(double money){
        withdraws++;
        if(withdraws > 5){
            currentBalance = currentBalance - money - 5;
        }else{
            currentBalance -= money;
        }
    }

    //monthly fee for PS

    @Override
    public void monthlyFee(){
        if(currentBalance > 3000){
            withdraws = 0;
            return;
        }else{
            withdraws = 0;
            currentBalance -= 20;
        }
    }

    //interest method
    @Override
    public void addInterest(){
        currentBalance = currentBalance *0.03 + currentBalance;
    }
}
