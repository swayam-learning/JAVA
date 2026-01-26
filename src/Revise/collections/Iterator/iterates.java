package Revise.collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class iterates {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(34);
        al.add(56);
        al.add(65);
        al.add(46);
        al.add(86);
        al.add(96);
        al.add(26);

        Iterator<Integer> it = al.iterator();
        while(it.hasNext()){
            Integer num = it.next();
            System.out.println(num);
        }
        

    }
}
