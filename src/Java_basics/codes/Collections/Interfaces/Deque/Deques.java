package Java_basics.codes.Collections.Interfaces.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deques {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offerFirst(10); //similar to push operation
        dq.offerFirst(20); // similar to push operation
        dq.offerFirst(30);
        dq.offerFirst(40);
        dq.offerFirst(50);
        System.out.println(dq);
        dq.pollFirst();
        System.out.println(dq);
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        dq.offerLast(121323);
        System.out.println(dq);

    }
}
