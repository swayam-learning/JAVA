package Revise.collections.List_Interface;

import java.util.*;

public class VectorClass {
    public static void main(String[] args) {
        // vectors are thread safe
        Vector<Integer> v1 = new Vector<>();
        v1.add(102);
        v1.add(23);
        v1.add(232);
        System.out.println(v1.size());
        System.out.println(v1.get(1));

    }
}