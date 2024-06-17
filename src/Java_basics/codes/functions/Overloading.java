package Java_basics.codes.functions;

public class Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("swayam");
    }
//function overloading works at compile time whereas function overriding works at runtime
//    this says that if there two or more than two functions with same name they can exist only if the
//    no of parameters are different or data types of parameters are different
    private static void fun(int a ) {
        System.out.println(a);
    }
    private static void fun(String name){
        System.out.println(name);
    }

}
