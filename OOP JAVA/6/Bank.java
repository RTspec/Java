//Rahul Tudu RollNo-12030523037
class BankAccount {
    String name;
    String accountNumber;
    double balance;
    double interestRate;
    BankAccount(String n, String accNo, double bal, double rate) {
        name = n;
        accountNumber = accNo;
        balance = bal;
        interestRate = rate;
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs." + amount);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Not enough balance!");
        }
    }
    double calculateInterest() {
        return (balance * interestRate) / 100;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: Rs." + balance);
    }
}
public class Bank {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Rahul Tudu", "123", 2000, 5);
        acc.display();
        acc.deposit(600);
        acc.withdraw(200);
        System.out.println("Interest for 1 year: Rs." + acc.calculateInterest());
        acc.display();
    }
}
