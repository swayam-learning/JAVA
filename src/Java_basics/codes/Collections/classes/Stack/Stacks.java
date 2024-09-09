package Java_basics.codes.Collections.classes.Stack;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push(50);
        stk.push(60);
        while(! stk.isEmpty()){
            System.out.println(stk.peek());
            stk.pop();
        }
    }
}
