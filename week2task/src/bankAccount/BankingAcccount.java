package bankAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class BankingAcccount {


    public static void main(String[] args) {

        ArrayList<Account> accounts = new ArrayList<>();
        Scanner In = new Scanner(System.in);
        for ( int i=0;i<accounts.size();i++){
            accounts.add(accounts.get(i));
        }
        bank Bank = new bank(accounts);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. create  an account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. display balance");
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
                    double intialbalance=  scanner.nextDouble();
                    Account acouunt= new Account(accountNumber,accountHolderName, intialbalance);
                    Bank.addAccount(acouunt);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    System.out.print("Enter amount to deposit: ");
                    double amount = scanner.nextDouble();
                    Bank.deposit(accountNumber, amount);
                    System.out.println("Deposit successful");
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    System.out.print("Enter amount to withdraw: ");
                    amount = scanner.nextDouble();
                    Bank.withdraw(accountNumber, amount);
                    System.out.println("Withdrawal successful");
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    double balanceResult = Bank.getBalance(accountNumber);
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