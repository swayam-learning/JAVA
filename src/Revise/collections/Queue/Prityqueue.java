package Revise.collections.Queue;

import java.util.PriorityQueue;

public class Prityqueue {
    public static void main(String[] args) {
        // internally it is min heap ds
        // whwnever you ask for peek it gives you the smallest element
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>();

        p1.offer(10);
        p1.offer(34);
        p1.offer(45);
        p1.offer(67);
        System.out.println(p1);
        System.out.println(p1.peek());
        p1.poll();
        System.out.println(p1.peek());
        System.out.println(p1);

        // we cant interate on it using for loop as it is tree
        p2.offer(10);
        p2.offer(34);
        p2.offer(45);
        p2.offer(67);
        while(p2.isEmpty() == false ){
            System.out.println(p2.peek());
            p2.poll();
            // comes out in order
        }


    }
}
