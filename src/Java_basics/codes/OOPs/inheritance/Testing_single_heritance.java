package OOPs.inheritance;

public class Testing_single_heritance {
    public static void main(String[] args) {
        dog d = new dog();
        d.bark();
        d.eat();
    }
}
class animal{
    void eat(){
        System.out.println("now eating");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("now barking");
    }
}
//extends keyword indicates that you are making a new class that derives from an existing class. The meaning of
// "extends" is to increase the functionality.
//
//In the terminology of Java, a class which is inherited is called a parent or superclass, and the new class is
// called child or subclass.
