package DSA.Arrays;
import java.util.*;
public class array {
    public static void main(String[] args) {
//        arrays are heterogeneous
//        it is zero indexed
        int arr[]  = new int[5];
        int arr1[] = {1,2,3,4,5}; // when we initialise an array we basically have an object reference
        // printing that will  gives us the memory location
        // arr1[]   =  {1,2,3,4}
//        <-------->   <-------->
//        StackMemory  HeapMemory
//        Traversal
        for (int i = 0; i < 5; i++) {
            arr[i] = i;
        }
        for (int j = 0; j < 4; j++) {
            System.out.print(arr[j]+" ");
        }
        System.out.println(arr1);//will print the memory location
        System.out.println(java.util.Arrays.toString(arr1));// to print the array  O(n)
        arr1[2] = 12;
        System.out.println(java.util.Arrays.toString(arr1));
        Arrays.sort(arr1); // sorting O(nlogn)
        System.out.println(Arrays.toString(arr1));
        for(int x: arr1){ //for-each loop or enhanced for loop
            System.out.print(x+" ");
        }
    }
}

//arrays are easy to use
//fast insertion at the end of array
//an element can be accessed in constant time

//Disadvantages
// 1. fixed size
// 2. insertion in middle requires shifting
// 3. it always requires linear block of memory which is not always available