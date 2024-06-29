package Java_basics.codes.OOPs.super_keyword;

public class invoking_class_method {
    public static void main(String[] args) {
        dog1 dg = new dog1();
        dg.work();
    }
}
class animal1{
    void eat(){
        System.out.println("eating.....");
    }
}
class dog1 extends animal1{
    void eat(){
        System.out.println("eating food");
    }
    void bark(){
        System.out.println("barking...");
    }
    void work(){
        eat();
        super.eat(); // this is used to invoke the parent class method
        bark();
    }
}