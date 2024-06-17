package Java_basics.codes;

public class Auto_boxing_and_unboxing {
    public static void main(String[] args) {
        Integer a = 10;
        int b = a;//autoboxing
        System.out.println(b);
        int c = 20;
        Integer d = c;//unboxing
        System.out.println(d);
    }
}
