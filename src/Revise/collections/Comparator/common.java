package Revise.collections.Comparator;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class common {
    public static void main(String[] args) {
        List<Integer> l1 = new LinkedList<>();
        l1.add(23);
        l1.add(43);
        l1.add(5);
        l1.add(45);
        Collections.reverse(l1);
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);
        System.out.println(Collections.min(l1));
        System.out.println(Collections.max(l1));

        
    }
}
