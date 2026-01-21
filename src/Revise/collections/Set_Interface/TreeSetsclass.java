package Revise.collections.Set_Interface;

import java.util.TreeSet;

public class TreeSetsclass {
    public static void main(String[] args) {
        TreeSet<Integer> t1 = new TreeSet<>();
        // DS that stores in ordered manner
        t1.add(1);
        t1.add(34);
        t1.add(89);
        for (Integer var : t1) {
            System.out.println(var);
        }
        // O(log n)--because ot sorts the values
        t1.remove(34);
        for (Integer var : t1) {
            System.out.println(var);
        }
        System.out.println(t1.floor(8));
        // prints the first value that is less than or equal to  8

        System.out.println(t1.ceiling(4));
        // prints the first value that is greater than or equal to 4

    }
}
