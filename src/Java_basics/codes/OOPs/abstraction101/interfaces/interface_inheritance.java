package Java_basics.codes.OOPs.abstraction101.interfaces;

public class interface_inheritance {
    public static void main(String[] args) {
        test tst = new test();
        tst.show();
        tst.print();
    }
}
interface printable {
    void print();
}
interface showable extends  printable{
    void show();
}
class test implements showable{
    public void show(){
        System.out.println("this method is showing");
    }
    public void print(){
        System.out.println("this method is printing");
    }
}