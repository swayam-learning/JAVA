package Revise.Abstraction;

abstract class BankAccount{
    // Abstract class cannot have objects
    double balance;
    abstract void addMoney(double amount);
    abstract void withdrawMoney(double amount);
    void updatemoney(double balance){
        this.balance  = balance;
    }
    double getBalance(){
        return balance;
    }
}
class SavingsAccount extends BankAccount{
    double amount;
     SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    // public void addMoney(double amount){
    //     super.updatemoney(super.getBalance()+amount);
    // }
    
    // two types of implementation either using super keyword or override
    @Override
    public void addMoney(double amount){
        updatemoney(getBalance()+amount);
    }
    public void withdrawMoney(double amount){
        super.updatemoney(super.getBalance()-amount);
    }


}
public class abst {
      public static void main(String[] args) {
            SavingsAccount s1 = new SavingsAccount(10000);
            s1.addMoney(2500);
            System.out.println("After adding money ---> "+s1.getBalance());

            s1.withdrawMoney(3000);
            System.out.println("Withdraw Money ---> "+ s1.getBalance());
    }
       
}
