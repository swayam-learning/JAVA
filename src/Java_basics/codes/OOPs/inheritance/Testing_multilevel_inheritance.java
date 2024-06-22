package OOPs.inheritance;

public class Testing_multilevel_inheritance {
    public static void main(String[] args) {
        dog1 d1= new dog1();
        cat1 c1 = new cat1();
        d1.bark();
        d1.eat();
        c1.meowing();
        c1.eat();
    }
}
class animal1{
    void eat(){
        System.out.println("now eating");
    }


}
class dog1 extends animal1{
    void bark(){
        System.out.println("now barking");
    }}
class cat1 extends animal1{
    void meowing(){
        System.out.println("now meowing");
    }
}