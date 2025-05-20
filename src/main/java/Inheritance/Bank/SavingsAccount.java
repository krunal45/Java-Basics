package Inheritance.Bank;

public class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount() {
        this.interestRate = 3;
    }

    void addInterest() {
        balance = balance + balance * interestRate;
    }
}
