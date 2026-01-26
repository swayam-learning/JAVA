package Revise.collections.Map_Interface;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        // does not store the keys in sorted manner
        HashMap<Integer,String> h1 = new HashMap<>();
        h1.put(1,"Swayam"); // O(1)
        h1.put(2,"Swarup");
        h1.put(3,"Barik");
        System.out.println(h1.get(3)); // O(1)
        System.out.println(h1.size());
        h1.remove(2); // O(1)
        System.out.println(h1.get(2));
    }
}
