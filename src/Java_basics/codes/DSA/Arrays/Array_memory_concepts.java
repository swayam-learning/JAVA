package Java_basics.codes.DSA.Arrays;

import java.util.Arrays;

public class Array_memory_concepts {
    public static void main(String[] args) {
        int money = 100;
        int[] fm = {100,200,300,400};
        doublemoney(money);
        System.out.println(money);// we expected the money to double but it doesnot
        double_money(money);
        System.out.println(money);
        double_moneys(money);
        double_array_money(fm);
        System.out.println(Arrays.toString(fm));// in case of arrays they pass by value the memory address and not the
        // object so they are working on the same array and making changes to it
    }
    public static void doublemoney(int money){
        money = 2*money;//here we worked on a copy when we move out of the function it gets destroyed
        // this money was called by pass by value but we are passing the object here
    }
    public static int double_money(int money){
        return 2*money;// still the amount remains same
    }
    public static void double_moneys(int money){
        System.out.println(2*money);// here we directly printed the answer
    }
    public static void double_array_money(int[] fm){
        for (int i = 0; i < fm.length; i++) {
            fm[i] = fm[i]*2;
        }
    }
}