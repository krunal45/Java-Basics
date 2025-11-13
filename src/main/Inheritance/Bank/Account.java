package main.Inheritance.Bank;

public class Account {
    protected String accountNumber;
    static protected double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        boolean hasSufficientBalance = balance - amount > 0;
        if (hasSufficientBalance)
            balance = balance - amount;
        else
            System.out.println("ERROR: Insufficient Balance");
    }
}
