package Inheritance.Bank;

public class CheckingAccount extends Account {
    double overdraftLimit;

    CheckingAccount() {
        this.overdraftLimit = 2500;
    }

    @Override
    void withdraw(double amount) {
        if (amount < (balance + overdraftLimit))
            balance = (balance + overdraftLimit) - amount;
        else
            System.out.println("Exceeded Overdraft Limit!");
    }
}
