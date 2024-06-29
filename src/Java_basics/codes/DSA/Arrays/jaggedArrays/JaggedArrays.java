package Java_basics.codes.DSA.Arrays.jaggedArrays;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArrays {
//    jagged array is an array with variable number of columns
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int R = inp.nextInt();
//        int M = inp.nextInt();

        int[][] arr = new int[R][];// we can skip the columns
        for (int i = 0; i <R ; i++) {
            System.out.println("no of columns in current row");
            int colsInCurrentRow = inp.nextInt();
            System.out.println("Data in current row");
            arr[i] = new int[colsInCurrentRow];
            for (int j = 0; j < colsInCurrentRow; j++) {
                arr[i][j] = inp.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));

    }
}
