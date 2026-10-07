//Jeffrey Edwards, personal checking for bank

public class PersonalChecking extends BankAccount {

    public PersonalChecking(String accountName, double currentBalance, String address, String emailAddress, String phone){
        super(accountName, currentBalance, address, emailAddress, phone);
        accountType = "Personal Checking";
    }
}
