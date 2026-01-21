package Revise.collections.Set_Interface;

import java.util.HashSet;

public class HashsetClass {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>();
        h1.add(1);
        h1.add(34);
        h1.add(54);
        System.out.println(h1);
        // no gurantee on sorted order
        System.out.println(h1.contains(1));
        for (int a  : h1) {
            System.out.println(a);
            
        }
        // O(1) -- no sorting
    }
}
