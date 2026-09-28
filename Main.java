package Account;

public class Main {

    
    static void performAccountOperations(Account account) {

        System.out.println("\n----------------------------");

        account.displayAccountDetails();

        System.out.println("\nDeposit Operation:");
        account.deposit(5000);

        System.out.println("\nWithdrawal Operation:");
        account.withdraw(3000);

        System.out.println("\nInterest Calculation:");
        account.calculateInterest();

        System.out.println("----------------------------");
    }

    public static void main(String[] args) {

        Account account1 =new SavingAccount(101, "Sanket", 20000);

        Account account2 = new CurrentAccount(102, "Rahul", 30000);

        Account account3 =new SalaryAccount(103, "Amit", 25000);


        performAccountOperations(account1);

        performAccountOperations(account2);

        performAccountOperations(account3);
    }
}