package Revise;
class BalanceAccount{
    double balance;
    public BalanceAccount(double _balance){
        balance = _balance;
    }
    public void printBalance(){
        System.out.print(balance);
    }
}
public class Revise {
    public static void main(String[] args) {
        BalanceAccount  test = new BalanceAccount(1000.00);
        test.printBalance();
    }
}
