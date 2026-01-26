package Revise.collections.Map_Interface;

import java.util.*;
public class Treemap {
    public static void main(String[] args) {
        // stores key in sorted manner
        TreeMap<Integer,String> h1 = new TreeMap<>();
        h1.put(1,"Swayam"); // O(1)
        h1.put(2,"Swarup");
        h1.put(78,"Barik");
        h1.put(43,"fh");
        h1.put(6,"oye hoye");
        // tree map doesnto store duplicate
        h1.put(6,"hello"); 
        // this replaces the key 6

        System.out.println(h1.get(3)); // O(1)
        System.out.println(h1.size());
        h1.remove(2); // O(1)
        System.out.println(h1.get(2));
        System.out.println(h1.ceilingKey(2));
        // it gives you the first key that is greater than or equal 
        System.out.println(h1.get(h1.ceilingKey(2)));

        Set<Integer> s1 = h1.keySet();
        System.out.println(s1);

    }
}
