package Java_basics.codes.OOPs.abstraction101.interfaces;

public class default_interface {
    public static void main(String[] args) {
        tests ts = new tests();
        ts.func();
        ts.func1();
        ts.func2();
        ts.print();
    }
}
interface printables{
    void print();
    default void func(){
        System.out.println("this function is under default so it can have a body");
    }
}
interface  showables extends printables{
    void print();
    default void func1(){
        System.out.println("this function is also under default so it can have a body");
    }
}
class tests implements showables{
    void func2(){
        System.out.println("this is class implementing interface showables");
    }
    public void print(){
        System.out.println("Printing function implementation ");
    }
}