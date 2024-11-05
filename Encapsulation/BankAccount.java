package Encapsulation;

public class BankAccount {
    private long accountNumber;
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit: " + amount);
        } else {
            System.out.println("Invalid Deposit Amount:");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("withdraw: " + amount);
        } else {
            System.out.println("insufficient amount");
        }
    }


    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber() {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

}
