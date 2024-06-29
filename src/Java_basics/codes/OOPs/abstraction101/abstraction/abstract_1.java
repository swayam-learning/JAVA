package Java_basics.codes.OOPs.abstraction101.abstraction;

public class abstract_1 {
    public static void main(String[] args) {
        bike obj = new bmw();
        obj.run();
        obj.displayinfo();
    }
}
abstract class bike{
    bike(){
        System.out.println("the bike is created");
    }
    abstract void run();
    void displayinfo(){
        System.out.println("the bike is very fast");
    }
}
class bmw extends bike{
    void run(){
        System.out.println("the bmw bike is running ");
    }
}
//In object-oriented programming, when you declare a method as abstract in a class or an interface,
// it means that the method doesn't have an implementation in that particular class or interface.
// Instead, any non-abstract subclass must provide an implementation for that method.