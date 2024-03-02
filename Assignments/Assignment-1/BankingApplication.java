abstract class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    // Setter method for balance
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}


class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient funds in savings account!");
        }
    }

    // Concrete implementation of deposit method for SavingsAccount
    public void deposit(double amount) {
        double interest = amount * interestRate / 100;
        setBalance(getBalance() + amount + interest);
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit!");
        }
    }

    // Concrete implementation of deposit method for CurrentAccount
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(123456, 1000, 5.0);
        CurrentAccount currentAccount = new CurrentAccount(654321, 2000, 500);

        // Deposit operation invoked using concrete deposit method
        savingsAccount.deposit(500);
        currentAccount.deposit(1000);

        // Withdrawal operation invoked using abstract withdraw method
        savingsAccount.withdraw(200);
        savingsAccount.withdraw(2000);

        currentAccount.withdraw(1500);
        currentAccount.withdraw(3000);

        displayAccountDetails(savingsAccount);
        displayAccountDetails(currentAccount);
    }

    public static void displayAccountDetails(Account account) {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
        System.out.println();
    }
}
