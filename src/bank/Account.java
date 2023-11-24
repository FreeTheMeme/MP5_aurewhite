package bank;

import java.time.LocalDate;

public abstract class Account {
    private String accountNumber;
    private double balance;
    private LocalDate dateCreated;

    //acceces

    public String getAccountNumber() {
        return accountNumber;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }
    //tostr
    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", dateCreated=" + dateCreated +
                '}';
    }
    //constructor
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //abs
    public abstract void withdraw(double withdrawAmount);
    public abstract void deposit(double depositAmount);
}
