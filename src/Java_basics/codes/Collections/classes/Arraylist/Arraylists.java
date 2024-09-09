package Java_basics.codes.Collections.classes.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Arraylists {
    public static void main(String[] args) {
        List<Integer> alist  = new ArrayList<>();
        alist.add(10);
        alist.add(20);
        alist.add(30);
        System.out.println(alist);
        alist.set(1,1000);
        System.out.println(alist);

        List<Integer> alist2 = new ArrayList<>(alist);// making a copy of alist
        // we can pass any collections on this because it a constructor
        alist2.add(45);
        System.out.println(alist);
        System.out.println(alist2);

        for (int x:alist
             ) {
            System.out.print(x+" ");

        }
        System.out.println();
        List<Integer> alist3 = new ArrayList<>();
        alist3.add(4);
        alist3.add(5);
        alist3.add(6);
        alist3.add(7);
        alist3.add(4);

        alist3.addAll(alist2); //helps to add all new elements to the existing list
        System.out.println((alist3));
        System.out.println(alist3.indexOf(4));
        System.out.println(alist3.lastIndexOf(4));
        System.out.println(alist3.subList(1,4));

        alist3.set(1,10000);
        System.out.println(alist3);
        System.out.println(alist3.subList(1,4));// shallow copy : because the underlying array also gets changed

    }
}
