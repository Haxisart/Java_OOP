package CurrentAccount;

public class Main {
    public static void main(String[] args) {
        CurrentAccount account = new CurrentAccount("John Doe", 1000.0);

        System.out.println("Initial Account Details:");
        account.displayDetails();

        System.out.println("\nDepositing $500...");
        account.deposit(500.0);

        System.out.println("\nWithdrawing $1200...");
        account.withdraw(1200.0);

        System.out.println("\nWithdrawing $200...");
        account.withdraw(200.0);

        System.out.println("\nFinal Account Details:");
        account.displayDetails();
    }
}

