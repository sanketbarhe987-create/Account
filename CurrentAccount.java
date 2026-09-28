package Account;

class CurrentAccount extends Account {

    CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Current Account withdrawal successful.");
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    void calculateInterest() {

        double interest = balance * 0.03;

        System.out.println("Current Account Interest: ₹" + interest);
    }
}
