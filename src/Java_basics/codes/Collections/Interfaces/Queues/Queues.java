package Java_basics.codes.Collections.Interfaces.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        q.offer(60);
        System.out.println(q.peek());

        System.out.println(q.poll());

        System.out.println(q.peek());

        System.out.println(q);

        Integer arr[] = q.toArray(new Integer[0]);
        for (int x:arr
             ) {
            System.out.print(x+",");
        }
        System.out.println();
        for (int x:q
             ) {
            System.out.print(x+" ");
        }
        System.out.println();

        System.out.println(q.isEmpty());


    }
}
