package Revise.collections.Queue;

import java.util.ArrayDeque;

public class Arraydeque {
    public static void main(String[] args) {
        // FIFO -- First in First Out
        ArrayDeque<Integer> a1 = new ArrayDeque<>();
        a1.offer(99);
        a1.offer(78);
        a1.offer(24);
        System.out.println(a1.peek());
        // FIFO

        a1.poll();
        // removes the first element
        System.out.println(a1.peek());
        System.out.println(a1.size());
        a1.offerLast(45);
        System.out.println(a1.peekLast());
        a1.offerFirst(34);
        System.out.println(a1.peekFirst());
    }
}
