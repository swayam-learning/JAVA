package Java_basics.codes.DSA.Arrays;

import java.util.Scanner;

public class Arrays_input {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int x:arr){
            System.out.print(x + " " );
        }

    }
}
