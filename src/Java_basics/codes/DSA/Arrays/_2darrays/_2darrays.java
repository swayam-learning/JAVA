package Java_basics.codes.DSA.Arrays._2darrays;

import java.util.Arrays;

public class _2darrays {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12, 13}};
        System.out.println(Arrays.toString(arr));// this will give us the addresses of these array objects
//        inbuilt method
        System.out.println(Arrays.deepToString(arr));
//        iteration method
        show_array(arr);
    }

    public static void show_array(int[][] arr) {
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
        }
    }

}
// a 2d arrays is a 1d array of objects where each array is treated like and object refer to the image attached