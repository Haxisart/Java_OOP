package BankCreditAccount;

public class Main {
    public static void main(String[] args) {
        BankCreditAccount account = new BankCreditAccount("Gold Card", 5000.0);

        System.out.println("Account Details:");
        account.displayAccountDetails();

        System.out.println("\nMaking a purchase of $1500...");
        account.makePurchase(1500.0);

        System.out.println("\nMaking a purchase of $4000...");
        account.makePurchase(4000.0);

        System.out.println("\nMaking a payment of $2000...");
        account.makePayment(2000.0);

        System.out.println("\nFinal Account Details:");
        account.displayAccountDetails();
    }
}

