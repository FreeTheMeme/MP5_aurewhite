package bank;


    public class SavingAccount extends Account{
    private String accountNumber;
    private double balance;
    private double annualInterestRate = 0.02;
    private double minDeposit;
    private double monthlyFee = 10;

        @Override
        public void setBalance(double balance) {
            this.balance = balance;
        }

//abs

    @Override
    public void withdraw(double withdrawAmount) {
        double newBalance;
        newBalance = balance - withdrawAmount;
        if(newBalance<=0){
            System.out.println("cannot overdraft");
        }else {
            setBalance(newBalance);
            System.out.println("withdrawing: " + withdrawAmount + " into SavingAccount " + accountNumber + " balance: " + balance);
        }
    }

    @Override
    public void deposit(double depositAmount) {
        double newBalance;
        double newBalanceInterest;
        if(depositAmount<minDeposit){
            System.out.println("Amount has to more than "+minDeposit+"$");
        }else {
        newBalance = (balance + depositAmount);
        newBalanceInterest = newBalance + (newBalance*annualInterestRate);
        setBalance(newBalanceInterest);
            System.out.println("depositing: "+depositAmount+" into SavingAccount "+accountNumber+" balance: "+balance);
        }
    }

        //toSTR


        @Override
        public String toString() {
            return  "\nSaving Account" +
                    "\n account No='" + accountNumber + '\'' +
                    "\n balance=" + balance +
                    "\n annualInterestRate=" + annualInterestRate +
                    "\n minDeposit=" + minDeposit +
                    "\n monthlyFee=" + monthlyFee +
                    "\n" + super.toString();
        }

        public SavingAccount(String accountNumber, double balance, double minDeposit) {
        super(accountNumber, balance);
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.minDeposit = minDeposit;

    }

}
