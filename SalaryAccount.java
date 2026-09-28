package Account;

class SalaryAccount extends Account {

    SalaryAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Salary Account withdrawal successful.");
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    void calculateInterest() {

        double interest = balance * 0.08;

        System.out.println("Salary Account Interest: ₹" + interest);
    }
}
