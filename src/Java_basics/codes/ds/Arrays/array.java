package Java_basics.codes.ds.Arrays;

import java.util.*;
public class array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        int arr1[]    =      new int[5];
// this happens at compile time in the stack memory
//                           this happens at run time in the heap memory(dynamic memory allocation)
//  array in cpp is continuous memory allocation but in java it depends on jvm whether it is going to be continuous
//  because heap objects are not continuous
//        so Array may or may not be continuous in java it depends on jvm

        System.out.println(arr[0]);
        arr[0] = 33; // arrays are mutable
        System.out.println(arr[0]);
    }
}
