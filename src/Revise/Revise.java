package Revise;

import Revise.encapsulation.BalanceAccount;

class BalanceAccount{
    double balance;
    String AccountType;
    public BalanceAccount(double _balance){
        // paramterised consturctor
        balance = _balance;
    }
      public BalanceAccount(double _balance,String _AccountType){
        // paramterised consturctor
        balance = _balance;
        AccountType = _AccountType;
    }
    public void printBalance(){
        System.out.println(balance);

    }
      public void printAccountType(){
        System.out.println(AccountType);
    }
}
public class Revise {
    public static void main(String[] args) {
        BalanceAccount  test = new BalanceAccount(1000.00);
        BalanceAccount  test1 = new BalanceAccount(1000.00,"Savings");
        test.printBalance();
        test1.printBalance();
        test1.printAccountType();
    }
}
