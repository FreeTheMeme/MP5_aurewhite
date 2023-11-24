package bank;

public class CheckingAccount extends Account {
    //vars
    private String accountNumber;
    private double balance;
    private double overdraftLimit;

    //abs

    @Override
    public void withdraw(double withdrawAmount) {
        double newBalance;
        newBalance = balance - withdrawAmount;
        if(newBalance <= 0-overdraftLimit){
            System.out.println("overdraftLimit reached");
        }else {
            setBalance(newBalance);
            System.out.println("withdrawing: "+withdrawAmount+" into CheckingAccount "+accountNumber+"balance: "+balance);
        }
    }

    @Override
    public void deposit(double depositAmount) {
        double newBalance;
        newBalance = balance + depositAmount;
        setBalance(newBalance);
        System.out.println("depositing: "+depositAmount+" into CheckingAccount "+accountNumber+"balance: "+balance);
    }
    //tostr

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", overdraftLimit=" + overdraftLimit +
                "} ";
    }


    //con


    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }
}
