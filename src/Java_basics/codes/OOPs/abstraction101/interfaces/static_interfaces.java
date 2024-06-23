package OOPs.abstraction101.interfaces;

public class static_interfaces {
    public static void main(String[] args) {
        tests1 ts = new tests1();
        System.out.println(printables1.func());//it can be accessed through interface only and not by class name
        System.out.println(showables1.func1());
        ts.func2();
        ts.print();
    }
}
interface printables1{
    void print();
    static String func(){
        return "this function is under static so it can have a body";
    }
}
interface  showables1 extends printables1{
    void print();
    static String func1(){ // should have return type
        return "this function is also under Static so it can have a body";
    }
}
class tests1 implements showables1{
    void func2(){
        System.out.println("this is class implementing interface showables");
    }
    public void print(){
        System.out.println("Printing function implementation ");
    }
}
