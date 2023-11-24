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

    public void now(){
        LocalDate currentDate = LocalDate.now();
        dateCreated = currentDate;
    }
    //abs
    public abstract void withdraw(double withdrawAmount);
    public abstract void deposit(double depositAmount);

    //tostr
    @Override
    public String toString() {
        return "Account{" +
                ", dateCreated=" + dateCreated;
    }
    //constructor
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        now();
    }
}
