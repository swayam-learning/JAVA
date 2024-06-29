package Java_basics.codes.DSA.Arrays._2darrays;

import java.util.Arrays;
import java.util.Scanner;

public class _2dArrayInput {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = inp.nextInt();
        int M = inp.nextInt();
        int[][] arr = new int[N][M]; //N rows and M columns
        for (int i = 0; i < N ; i++) {
            for (int j = 0; j <M ; j++) {
                arr[i][j] = inp.nextInt();
            }

        }
        //Print
        System.out.println(Arrays.deepToString(arr));
    }
}
