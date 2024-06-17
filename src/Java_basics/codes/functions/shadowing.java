package Java_basics.codes.functions;

public class shadowing {
    static int x=90;// it will available to it's scope
    //and will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);//90
        int x=40;//scope will begin when the value is initialised and not when the variable is declared
        int a=10;
        System.out.println(a+x);
        System.out.println(x);//40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
