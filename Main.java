import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nBanking Management System");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accNum = scanner.nextLine();
                    System.out.print("Enter account holder name: ");
                    String accHolder = scanner.nextLine();
                    if (bank.createAccount(accNum, accHolder)) {
                        System.out.println("Account created successfully.");
                    } else {
                        System.out.println("Account number already exists.");
                    }
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    accNum = scanner.nextLine();
                    Account acc = bank.getAccount(accNum);
                    if (acc != null) {
                        System.out.print("Enter amount to deposit: ");
                        double amount = scanner.nextDouble();
                        acc.deposit(amount);
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accNum = scanner.nextLine();
                    acc = bank.getAccount(accNum);
                    if (acc != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double amount = scanner.nextDouble();
                        if (acc.withdraw(amount)) {
                            System.out.println("Withdrawal successful.");
                        } else {
                            System.out.println("Insufficient balance or invalid amount.");
                        }
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    accNum = scanner.nextLine();
                    acc = bank.getAccount(accNum);
                    if (acc != null) {
                        System.out.println("Account Holder: " + acc.getAccountHolder());
                        System.out.println("Balance: " + acc.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
