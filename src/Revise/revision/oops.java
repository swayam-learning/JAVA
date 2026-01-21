package Revise.revision;

class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String Message){
        super(Message);
    }
}

abstract class  BankAccount {
    static String bankName="Default Bank";
    final String accountNumber;
    private double balance;

    static void changeBankName(String name){
        bankName = name;
    }
    
    BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
   
    protected void updateMoney(double balance){
        this.balance = balance;
    }
    double getBalance(){
        return balance;
    }
    abstract void addMoney(double amount);
    abstract void withdrawMoney(double amount) throws InsufficientBalanceException;
    
}


interface  DigitalPayment {
    void pay(double amount) throws InsufficientBalanceException;
    
}

class SavingsAccount extends BankAccount implements DigitalPayment{
    double initialBalance;
    private final double minBalance = 1000;
    SavingsAccount(String accountNumber,double initialBalance){
        super(accountNumber,initialBalance);
    }

    @Override
    void addMoney(double amount){
        if(amount>0){
            updateMoney(getBalance()+amount);
        }
    }

    @Override
    void withdrawMoney(double amount) throws InsufficientBalanceException{
        if(getBalance() - amount >= minBalance ){
            updateMoney(getBalance()-amount);
        }
        else{
            throw new InsufficientBalanceException("Savings Account : Minm Balance 1000 must be maintained");
        }
    }
        @Override
        public void pay(double amount) throws InsufficientBalanceException{
            withdrawMoney(amount);
        }

    }

class CurrentAccount extends BankAccount implements DigitalPayment {

    private final double OVERDRAFT_LIMIT = 5000;

    CurrentAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    void addMoney(double amount) {
        if (amount > 0) {
            updateMoney(getBalance() + amount);
        }
    }

    @Override
    void withdrawMoney(double amount) throws InsufficientBalanceException {
        if (getBalance() - amount >= -OVERDRAFT_LIMIT) {
            updateMoney(getBalance() - amount);
        } else {
            throw new InsufficientBalanceException(
                "CurrentAccount: Overdraft limit exceeded"
            );
        }
    }

    @Override
    public void pay(double amount) throws InsufficientBalanceException {
        withdrawMoney(amount);
    }
}

public class oops {
    public static void main(String[] args) {

        // Static member test
        BankAccount.changeBankName("State Bank of Java");
        System.out.println("Bank Name: " + BankAccount.bankName);

        // Polymorphism
        BankAccount acc1 = new SavingsAccount("SA101", 5000);
        BankAccount acc2 = new CurrentAccount("CA201", 2000);

        try {
            acc1.addMoney(1000);
            acc1.withdrawMoney(3000);
            ((DigitalPayment) acc1).pay(1500);

            acc2.withdrawMoney(6000);
            ((DigitalPayment) acc2).pay(1000);

        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }

        System.out.println("Savings Balance: " + acc1.getBalance());
        System.out.println("Current Balance: " + acc2.getBalance());
    }
}
