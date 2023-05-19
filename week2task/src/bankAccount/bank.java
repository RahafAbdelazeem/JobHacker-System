package bankAccount;
import java.util.ArrayList;
import java.util.List;

public class bank {
    ArrayList <Account> accounts;
    int numAccounts;


    public bank(ArrayList<Account> accounts) {
        this.accounts = accounts;

    }

    public  void addAccount(Account account) {
        this.accounts.add(account);

        try {

            accounts.set(numAccounts, account);
            numAccounts++;
        }

        catch( NullPointerException e){
            System.out.print("Null");

        }
    }

    public  double deposit(String accountNumber, double amount) {

        for (Account A:accounts) {
            if (A.accountNumber.equals(accountNumber)) {
                A.deposit(amount);
                return amount;
            }
        }
        System.out.println("Account not found");
        return amount;
    }

    public  double withdraw(String accountNumber, double amount) {

        for( Account A:accounts){
            if (A.accountNumber.equals(accountNumber)) {
                A.withdraw(amount);
                return amount;
            }
        }
        System.out.println("Account not found");
        return amount;
    }

    public  double getBalance(String accountNumber) {

        for ( Account  A: accounts) {
            if (A.accountNumber.equals(accountNumber)) {
                return A.getBalance();
            }
        }
        System.out.println("Account not found");
        return -1;
    }
}