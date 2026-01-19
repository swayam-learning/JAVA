package Revise.Interface;
interface Animal {
    void bark();
    default void sleep(){
        System.out.println("Animal Sleeps");
    }
    
}
class dog implements Animal{
    public void bark(){
        System.out.println("Dog Barks");
    }

    public void sleep(){
        System.out.println("The Dog is sleeping");
    }
}
public class interface1 {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.bark();
        d1.sleep();
    }
}
