package CurrentAccount;

public class CurrentAccount {
    private String accountHolderName;
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(String accountHolderName, double overdraftLimit) {
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
        this.overdraftLimit = overdraftLimit;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: " + balance);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
        } else if (amount > balance + overdraftLimit) {
            System.out.println("Withdrawal denied: Exceeds overdraft limit.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
        }
    }

    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}
