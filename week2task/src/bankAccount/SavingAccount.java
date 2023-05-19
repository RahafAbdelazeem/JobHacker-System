package bankAccount;

public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public SavingAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }



    public double calculateInterest() {
        return balance * (interestRate/100);
    }
}
