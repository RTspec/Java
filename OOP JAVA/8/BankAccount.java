//Rahul Tudu RollNo-12030523037
public class BankAccount {
    private int accountNumber;
    private double balance;
    private static int totalAccountsCreated = 0;
    public BankAccount(double initialBalance) {
        totalAccountsCreated++;
        this.accountNumber = totalAccountsCreated;  
        this.balance = initialBalance;
    }   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    public double getBalance() {
        return balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public static int getTotalAccountsCreated() {
        return totalAccountsCreated;
    }
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(10000);
        BankAccount acc2 = new BankAccount(20000);
        acc1.deposit(2000);
        acc1.withdraw(1050);
        acc2.deposit(1000);
        acc2.withdraw(7000); 
        System.out.println("Account 1 (Acc No: " + acc1.getAccountNumber() + ") Balance: Rs." + acc1.getBalance());
        System.out.println("Account 2 (Acc No: " + acc2.getAccountNumber() + ") Balance: Rs." + acc2.getBalance());
        System.out.println("Total Accounts Created: " + BankAccount.getTotalAccountsCreated());
    }
}
