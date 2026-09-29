class Account {
    private int accountNumber;
    private double balance;
    public Account() {
        accountNumber = 0;
        balance = 0;
    }
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance = balance + amount;
    }
    public void withdraw(double amount) {
        balance = balance - amount;
    }
    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}
class AccountRun {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.displayBalance();
        Account a2 = new Account(101, 5000);
        a2.displayBalance();
        a2.deposit(1000);
        a2.displayBalance();
        a2.withdraw(2000);
        a2.displayBalance();
    }
}

