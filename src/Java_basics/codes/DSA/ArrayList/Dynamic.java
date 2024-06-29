package Java_basics.codes.DSA.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Dynamic {
    public static void main(String[] args) {
//        just like ann array but have no size limit
//        maintains insertion order
//        we can add or remove elements
//        we can store heterogeneous objects

//   Features
//        1. Dynamic Resizing
//        2. Ordered
//        3. Index Based
//        4. Object based (cannot store Primitive Data types , so we use Wrapper Class
//        5. Not Synchronized (we can use Vector class for synchronization)

//    Operations
//        1. Random Access Time O(1)
//        2. Adding elements O(1)
//        3. Insertion and Deletion O(n)
//        4. Searching O(n) for unsorted and for sorted O(1)

//        Implementation
//        created an array of no data type so it can store and type of objects
        ArrayList arr = new ArrayList<>(50);// once we reach 50 it will increase
        arr.add(25);
        arr.add("swayam");
        arr.add(3.45f);
        System.out.println(arr);

//        ArrayList of Integer Datatype
        ArrayList<Integer> arr1 = new ArrayList<>(10);
        arr1.add(134);
        arr1.add(2344);
        System.out.println(arr1);

//        List Addition
        List<Integer>  arr2 = new ArrayList<>();
        arr2.add(234);
        arr2.add(56);
        arr2.add(656);
        System.out.println(arr2);
        arr2.add(2,44);
        System.out.println(arr2);

//      List Removal
        arr2.remove(3);
        arr2.remove(Integer.valueOf(234));
        System.out.println(arr2);
        if (arr.contains(56)){
            System.out.println("the value 56 is present");
        }
        arr2.set(0,43); //this will set 43 in 2nd index position

//        Iterating over ArrayList
//        1st way
        for (int i = 0; i <arr2.size() ; i++) {
            System.out.print(arr2.get(i)+" ");
        }
        System.out.println();
//        2nd way
        for (Integer i:arr2) {
            System.out.print(i+" ");

        }
        System.out.println();
//        3rd way
        Iterator<Integer> it = arr2.listIterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
