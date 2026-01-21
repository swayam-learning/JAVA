package Revise.collections.List_Interface;

import java.util.*;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(10);
        aList.add(16);
        aList.add(20);
        System.out.println(aList);
        System.out.println(aList.size());
        System.out.println(aList.get(2));
        System.out.println(aList.remove(2));
        System.out.println(aList);
        aList.add(1, 12);
        System.out.println(aList);   
        System.out.println(aList.contains(27));
    }
}
