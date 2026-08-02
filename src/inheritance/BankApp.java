package inheritance;

class BankAcc {
    String accountHolder;
    double balance;

    public BankAcc(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}

class SavingAcc extends BankAcc {
    double minBalance = 500.0;

    public SavingAcc(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive!");
        } else if ((balance - amount) >= minBalance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New Balance: $" + balance);
        } else if (balance >= amount) {
            System.out.println("Transaction Failed! Savings account must maintain at least $500 balance.");
        } else {
            System.out.println("Transaction Failed! Insufficient total funds.");
        }
    }
}

class CurrentAcc extends BankAcc {
    double overdraftLimit = 1000.0;

    public CurrentAcc(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive!");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". Remaining Balance: $" + balance);
        } else if (amount <= (balance + overdraftLimit)) {
            balance -= amount;
            System.out.println("Overdraft Used! Withdrew $" + amount + ". Current Balance: $" + balance);
        } else {
            System.out.println("Transaction Denied! Exceeds maximum overdraft limit of $1000.");
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        System.out.println("--- Savings Account Test ---");
        SavingAcc alex = new SavingAcc("Alex", 1200.0);
        alex.withdraw(800.0);
        alex.withdraw(500.0);

        System.out.println("\n--- Current Account Test ---");
        CurrentAcc sam = new CurrentAcc("Sam", 300.0);
        sam.withdraw(800.0);
        sam.withdraw(1000.0);
    }
}