package Revise.collections.Comparator;

import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class lambdafunc {
    public static void main(String[] args) {
        List<Integer> l2 = new LinkedList<>();
        l2.add(192);
        l2.add(23);
        l2.add(43);
        l2.add(5);
        l2.add(45);
        Collections.sort(l2,(num1,num2) -> num1-num2);
        // ascending order
        System.out.println(l2);


        // Descending order
        Collections.sort(l2,(num1,num2)-> num2-num1);
        System.out.println(l2);
    }
}
