package BankCreditAccount;

public class BankCreditAccount {
    private String creditName;
    private double creditLimit;
    private double currentBalance;

    public BankCreditAccount(String creditName, double creditLimit) {
        this.creditName = creditName;
        this.creditLimit = creditLimit;
        this.currentBalance = 0.0;
    }

    public void makePurchase(double amount) {
        if (amount > (creditLimit - currentBalance)) {
            System.out.println("Purchase denied: Exceeds credit limit.");
        } else {
            currentBalance += amount;
            System.out.println("Purchase successful. Current balance: " + currentBalance);
        }
    }

    public void makePayment(double amount) {
        if (amount <= 0) {
            System.out.println("Payment must be greater than zero.");
        } else if (amount > currentBalance) {
            System.out.println("Payment exceeds current balance. Paying off total balance.");
            currentBalance = 0.0;
        } else {
            currentBalance -= amount;
            System.out.println("Payment successful. Current balance: " + currentBalance);
        }
    }

    public void displayAccountDetails() {
        System.out.println("Credit Name: " + creditName);
        System.out.println("Credit Limit: " + creditLimit);
        System.out.println("Current Balance: " + currentBalance);
    }
}

