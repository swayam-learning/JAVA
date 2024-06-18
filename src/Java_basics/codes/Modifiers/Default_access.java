package Java_basics.codes.Modifiers;

public class Default_access {
    // it can be accessed within a package only
    public static void main(String[] args) {
        learn l1= new learn();
        l1.func();
    }

}
class learn{
    void func(){//this is case of default keyword can be accessed anywhere inside a package
        System.out.println("default access");
    }
}