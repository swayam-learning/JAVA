package DSA.Hashmap.Hashing;

import java.util.Scanner;

public class numhashing {
    public static void main(String[] args) {
        int maxval  = Integer.MIN_VALUE;
        System.out.println("Enter the size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            maxval = Math.max(maxval,arr[i]);
        }
        int[] hashedarr = new int[maxval+1];
        for (int num : arr) {
            hashedarr[num] += 1;
        }
        System.out.println("Max value in array: " + maxval);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("You queried: " + num);
        if(num < 0 || num > maxval){
            System.out.println("0");
        }
        else{
            System.out.println("The freuquncy of the queried number is :"+hashedarr[num]);
        }
    }
}
