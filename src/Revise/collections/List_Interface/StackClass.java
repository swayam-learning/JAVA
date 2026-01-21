package Revise.collections.List_Interface;
import java.util.*;

public class StackClass {
    public static void main(String[] args) {
        // LIFO -- Last in First Out
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(23);
        s1.push(43);
        s1.push(24);
        s1.push(54);
        s1.push(63);
        System.out.println(s1);
        System.out.println(s1.peek());
        s1.pop();
        System.out.println(s1.peek());
        System.out.println(s1.size());


    }
}
