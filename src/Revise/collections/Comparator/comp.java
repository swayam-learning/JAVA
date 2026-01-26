package Revise.collections.Comparator;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.*;

public class comp {
    public static void main(String[] args) {
        List<Integer> l1 = new LinkedList<>();
        l1.add(192);
        l1.add(23);
        l1.add(43);
        l1.add(5);
        l1.add(45);

        // comparator is an interface
        Collections.sort(l1,new Comparator<Integer>(){
            @Override
            public int compare(Integer num1,Integer num2){
                if(num1<num2){
                    return 1;
                }
                else if(num1>num2){
                    return -1;
                }
                return 0;

            }
        });
        System.out.println(l1);
         
    }
}
