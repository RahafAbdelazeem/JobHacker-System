package combankAccount;

public class bank {
    private Account[] accounts;
    private int numAccounts;

    public void Bank(int maxNumAccounts) {
        accounts = new Account[maxNumAccounts];
        numAccounts = 0;
    }
    public void addAccount(Account account) {
        String str = null;

        try {

            accounts[numAccounts] = account;
            numAccounts++;
        }

        catch( NullPointerException e){
             System.out.print("Null");

        }
    }
    
    public void deposit(String accountNumber, double amount) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].accountNumber.equals(accountNumber)) {
                accounts[i].deposit(amount);
                return;
            }
        }
        System.out.println("Account not found");
    }

    public void withdraw(String accountNumber, double amount) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].accountNumber.equals(accountNumber)) {
                accounts[i].withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found");
    }

    public double getBalance(String accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].accountNumber.equals(accountNumber)) {
                return accounts[i].getBalance();
            }
        }
        System.out.println("Account not found");
        return -1;
    }
}
