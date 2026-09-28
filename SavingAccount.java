package Account;

class SavingAccount extends Account {

    SavingAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    void withdraw(double amount) {

        if (balance - amount >= 1000) {
            balance = balance - amount;
            System.out.println("Saving Account withdrawal successful.");
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Cannot withdraw.");
            System.out.println("Minimum balance of must be maintained.");
        }
    }

    @Override
    void calculateInterest() {

        double interest = balance * 0.06;

        System.out.println("Saving Account Interest " + interest);
    }
}