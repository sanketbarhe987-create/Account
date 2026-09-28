package Account;

class Account {

    protected int accNo;
    protected String name;
    protected double balance;

    Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: ₹" + amount);
        System.out.println("Balance: ₹" + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void calculateInterest() {
        System.out.println("Interest calculation not defined.");
    }

    void displayAccountDetails() {
        System.out.println("Account No : " + accNo);
        System.out.println("Name       : " + name);
        System.out.println("Balance    : ₹" + balance);
    }
}
