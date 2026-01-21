package Revise.collections.List_Interface;


import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
       LinkedList<Integer> l1 = new LinkedList<>();
       l1.add(1);
       l1.add(2);
       l1.addFirst(3);
       l1.addLast(6);
       System.out.println(l1);
       l1.removeFirst();
       System.out.println(l1);
       System.out.println(l1.getFirst());
       l1.add(23);
       System.out.println(l1.getLast());
    }
}
