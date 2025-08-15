package in.kgcoding.challenge78;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0; // Initialize balance to 0
    }

    // Method to deposit money
    public void depositMoney(double money) {
        if (money <= 0) {
            System.out.println("Invalid Deposit");
        } else {
            balance += money;
            System.out.println("Deposited: " + money);
        }
    }

    // Method to withdraw money
    public double withdrawMoney(double money) {
        if (money <= 0) {
            System.out.println("Invalid Withdraw");
            return 0;
        } else if (balance >= money) {
            balance -= money;
            System.out.println("Withdrawn: " + money);
            return money;
        } else {
            double allMoney = balance;
            balance = 0;
            System.out.println("Insufficient balance. Withdrawn remaining: " + allMoney);
            return allMoney;
        }
    }

    // Method to display current balance
    public double getBalance() {
        return balance;
    }

    // Main method for testing
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", "Swayam");
        account.depositMoney(500);
        account.withdrawMoney(200);
        account.withdrawMoney(400);
        System.out.println("Final Balance: " + account.getBalance());
    }
}
