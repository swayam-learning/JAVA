package Java_basics.codes.OOPs.super_keyword;

public class Test {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.coloring();
        d1.eat();
    }
}
class Animal{
    String color = "brown";
    void eat(){
        System.out.println("eating .... ");
    }
}
class Dog extends Animal{
    String color = "black";
    void coloring(){
        System.out.println("the dog's color is red");
        System.out.println("the animal color is "+super.color);
    }

}