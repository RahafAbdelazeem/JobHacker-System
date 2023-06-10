package combankAccount;

public class Account {

        String accountNumber;
        private String accountHolderName;
        protected double balance;

        public Account(String accountNumber, String accountHolderName, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Insufficient balance");
                return;
            }
            balance -= amount;
        }

        public double getBalance()  {
            return balance;
        }
    }


