package Java_basics.codes.Collections.classes.PriorityQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> prq = new PriorityQueue<>();
        prq.offer(232);
        prq.offer(45);
        prq.offer(466);
        prq.offer(987);

//        top 2 elements
        List<Integer> top2 = new ArrayList<>();
        int index=0;
        while(!prq.isEmpty()){
            if(index==2)
                break;
            top2.add(prq.poll());
            index++;
        }
        System.out.println(top2);
        System.out.println(prq);


    }
}
