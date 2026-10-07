//Jeffrey Edwards, driver class for bank
import java.util.Scanner;

public class BankManagement {

    public static void main(String[] args) {
        AccountManager bank = new AccountManager();
        Scanner input = new Scanner(System.in);
        BusinessSavings BS1 = new BusinessSavings("Ikea",37000,"878 Tony dr",
                "Ikea@g.com","864 353 6789");
        PersonalSavings PS1 = new PersonalSavings("Emma",2000,"123 riprap dr",
                "emma2@g.com","864 222 2222");
        PersonalChecking PC1 = new PersonalChecking("Brandy",100,"456 tilt dr",
                "brandy@g.com","864 222 2345");
        BusinessChecking BC1 = new BusinessChecking("Walmart",90000,"231 money dr",
                "walmart@g.com","864 123 4567");
        int search;
        //personal savings requirements
        System.out.println("Demonstration of withdraw for personal savings, including the penalty for " +
                "withdrawing 6 or more times." + "\nAlso it will show the withdraws reset after a monthly fee.");
        System.out.println("Current Balance: " + PS1.getCurrentBalance());

        PS1.withdraw(30);
        PS1.withdraw(30);
        PS1.withdraw(30);
        PS1.withdraw(30);
        PS1.withdraw(30);
        PS1.withdraw(30);

        System.out.println("Current Balance: " + PS1.getCurrentBalance() + "\nCurrent Withdraws: " + PS1.getWithdraws());

        PS1.monthlyFee();

        System.out.println("Current Balance: " + PS1.getCurrentBalance());
        System.out.println("Shows that the monthly fee is not taken out if balance is above 3000.");
        PS1.deposit(3000);
        System.out.println("Current Balance: " + PS1.getCurrentBalance());
        PS1.monthlyFee();
        System.out.println("Monthly fee applied.");
        System.out.println("Current Balance: " + PS1.getCurrentBalance());

        System.out.println();

        //business savings requirements
        System.out.println("Demonstration of business savings withdraw.");
        System.out.println("Current Balance: " + BS1.getCurrentBalance());
        BS1.withdraw(30);
        System.out.println("30$ withdraw Current Balance: " + BS1.getCurrentBalance());

        //Business checking
        System.out.println("Demonstration of a business checkings withdraw.");
        System.out.println("Current Balance: " + BC1.getCurrentBalance());
        BC1.withdraw(11000);
        System.out.println("11,000$ withdraw Current Balance: " + BC1.getCurrentBalance());
        System.out.println();



        bank.newAccount(new PersonalSavings("jeff",20000,"231 rip dr",
                "jte2@g.com","864 444 4444"));
        bank.newAccount(new BusinessSavings("geff",20000,"231 rip dr",
                "jte2@g.com","864 444 4444"));
        bank.newAccount(new PersonalSavings("teff",20000,"231 rip dr",
                "jte2@g.com","864 444 4444"));
        bank.newAccount(new BusinessChecking("beff",20000,"231 rip dr",
                "jte2@g.com","864 444 4444"));
        bank.newAccount(new PersonalChecking("heff",20000,"231 rip dr",
                "jte2@g.com","864 444 4444"));
        bank.newAccount(new PersonalChecking("yeff",20000,"231 rip dr",
                "jte2@g.com","864 444 4444"));

        bank.addInterest();

        bank.applyFee();

        System.out.println("Array of accounts: ");

        bank.printArray();

        System.out.println("Which account would you like to find?");

        search = input.nextInt();

        bank.Accounts[2].withdraw(8000);

        System.out.println(bank.findAccount(search));


    }
}
