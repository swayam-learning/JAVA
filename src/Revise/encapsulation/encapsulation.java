package Revise.encapsulation;
class BalanceAccount{
    private double balance;
    public BalanceAccount(double balance){
        // paramterised consturctor
        this.balance = balance;
    }
    public void setBalance(double balance){
        this.balance  = balance;
    }

    public void printBalance(){
        System.out.println(balance);

    }
    public double getBalance(){
        return balance;
    }
}  
public class encapsulation {
    public static void main(String[] args) {
        BalanceAccount test = new BalanceAccount(1000);
        test.setBalance(10000.0);
        System.out.println(test.getBalance());
        test.printBalance();
   
    }
}
