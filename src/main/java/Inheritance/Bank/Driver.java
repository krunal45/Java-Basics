package Inheritance.Bank;

public class Driver {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println("--Balance before deposit--");
        System.out.println("Balance: "+ Account.balance);
        account.deposit(2000);
        System.out.println("--Balance after deposit--");
        System.out.println("Balance: "+ Account.balance);
        System.out.println("Withdraw less than balance amount : 1500");
        account.withdraw(1500);
        System.out.println("Balance after Withdraw");
        System.out.println("Balance: "+ Account.balance);
        System.out.println("Withdraw more than balance amount : 700");
        account.withdraw(700);
        System.out.println("--Applying Interest--");

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.addInterest();
        System.out.println("--Balance After Applying Interest--");
        System.out.println("Balance: "+ Account.balance);

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.withdraw(2100);
        System.out.println("Balance after withdraw 2100: "+Account.balance);
    }
}
