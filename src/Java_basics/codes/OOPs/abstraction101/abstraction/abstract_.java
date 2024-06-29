package Java_basics.codes.OOPs.abstraction101.abstraction;

public class abstract_ {
    public static void main(String[] args) {
//        There are two ways to achieve abstraction in java
//
//        Abstract class (0 to 100%)
//        Interface (100%)
        Sbi sbi = new Sbi();
        Pnb pnb = new Pnb();
        System.out.println(sbi.getRateOfInterest());
        System.out.println(pnb.getRateOfInterest());
    }
}
//Points to Remember
// 1. An abstract class must be declared with an abstract keyword.
// 2. It can have abstract and non-abstract methods.
// 3 .It cannot be instantiated.
// 4. It can have constructors and static methods also.
// 5. It can have final methods which will force the subclass not to change the body of the method.
abstract class Banks{
    abstract int getRateOfInterest();
}
class Sbi extends Banks{
    int getRateOfInterest(){
        return 7;
    }
}
class Pnb extends Banks{
    int getRateOfInterest() {
        return 8;
    }
}