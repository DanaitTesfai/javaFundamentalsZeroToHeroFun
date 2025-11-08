package org.java_fundamentals._09_composition._10_SafeBankAccountManagementSystem;

public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }


    public void deposit(double amount) throws InvalidInputException {
        if (amount <= 0) throw new InvalidInputException("Deposit amount should be greater than 0.");

        balance += amount;
        System.out.println("Amount deposited.");

    }


    public void withdraw(double amount) throws InvalidInputException {
        if (amount < 0) throw new InvalidInputException("Withdrawal amount must be positive.");
        if (amount > balance) throw new InvalidInputException("Insufficient funds.");

        balance -= amount;
        System.out.println("Withdrawal successful.");
    }


    public void transfer(Account account, double amount) throws InvalidInputException{
        if (account == null) throw new InvalidInputException("Target account does not exist.");

        this.withdraw(amount);
        account.deposit(amount);
        System.out.println("Transfer successful.");
    }
}
