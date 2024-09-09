package Java_basics.codes.Collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedLists {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(2436);
        list.add(232);
        list.add(20);
        list.add(1332);
        list.add(13224);

        ListIterator<Integer> iterator = list.listIterator();
        System.out.println(iterator.next()); //next returns the current element adn then moves the cursor to the next
        // element
        System.out.println(iterator.next());
        System.out.println(iterator.previous());
        // previous moves to the previous element first and then returns that element
        System.out.println(iterator.hasNext());

//        Logical Implementation of next and previous
//        next = return items[index++]; // postfix
//        previous = return items[--index]; // prefix

        Integer []arr = list.toArray(new Integer[0]);//  by convention we put 0 so that we can have new arraylist
        // which will be of exact size of the list without wasting any extra memory
        for (int x:arr
             ) {
            System.out.print(x+",");

        }
        System.out.println();
    }
}
