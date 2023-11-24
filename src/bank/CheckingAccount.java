package bank;

public class CheckingAccount extends Account {
    //vars
    private String accountNumber;
    private double balance;
    private double overdraftLimit;

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }


    //abs methods

    @Override
    public void withdraw(double withdrawAmount) {
        double newBalance;
        newBalance = balance - withdrawAmount;
        if(newBalance <= 0-overdraftLimit){
            System.out.println("overdraftLimit reached");
        }else {
            setBalance(newBalance);
            System.out.println("withdrawing: "+withdrawAmount+" into CheckingAccount "+accountNumber+" balance: "+balance);
        }
    }

    @Override
    public void deposit(double depositAmount) {
        double newBalance;
        newBalance = balance + depositAmount;
        setBalance(newBalance);
        System.out.println("depositing: "+depositAmount+" into CheckingAccount "+accountNumber+" balance: "+balance);
    }
    //tostr

    @Override
    public String toString() {
        return "\nChecking Account" +
                "\n account No='" + accountNumber + '\'' +
                "\n balance=" + balance +
                "\n overdraftLimit=" + overdraftLimit +
                "\n" + super.toString() +
                "\n";
    }


    //con


    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }
}
