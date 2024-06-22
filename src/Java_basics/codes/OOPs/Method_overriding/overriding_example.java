package OOPs.Method_overriding;

public class overriding_example {
    public static void main(String[] args) {
        child_class c1 = new child_class();
        c1.func();
    }
}
class parent_class{

    void func(){
        System.out.println("hello world");
    }
}
class child_class extends  parent_class{
    void func(){
        System.out.println("hello i am jose mourinho");
    }
}
