package combankAccount;

import java.util.Scanner;

public class BankingAcccount {
    public static void main(String[] args) {
        bank bank = new bank();

        // add some sample accounts
       SavingAccount account1 = new SavingAccount("1001", "Alice", 1000, 2.5);
       SavingAccount account2 = new SavingAccount("1002", "Bob", 500, 1.5);
       bank.addAccount(account1);
       bank.addAccount(account2);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Open an account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Check balance");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.next();
                    System.out.print("Enter account holder name: ");
                    String accountHolderName = scanner.next();
                    System.out.print("Enter initial balance: ");
                    double balance = scanner.nextDouble();
                    System.out.print("Enter interest rate (for savings accounts only): ");
                    double interestRate = scanner.nextDouble();
                    SavingAccount account = new SavingAccount(accountNumber, accountHolderName, balance, interestRate);
                    bank.addAccount(account);
                    System.out.println("Account created successfully");
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    System.out.print("Enter amount to deposit: ");
                    double amount = scanner.nextDouble();
                    bank.deposit(accountNumber, amount);
                    System.out.println("Deposit successful");
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    System.out.print("Enter amount to withdraw: ");
                    amount = scanner.nextDouble();
                    bank.withdraw(accountNumber, amount);
                    System.out.println("Withdrawal successful");
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    double balanceResult = bank.getBalance(accountNumber);
                    if (balanceResult >= 0) {
                        System.out.println("Balance: " + balanceResult);
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the banking application!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
