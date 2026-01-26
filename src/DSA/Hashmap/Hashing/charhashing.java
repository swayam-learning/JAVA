package DSA.Hashmap.Hashing;

import java.util.Scanner;

public class charhashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        char arr[] = new char[n];
        System.out.println("enter the character array");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        int[] hashedarr = new int[26];
        for (int charc : arr) {
            hashedarr[charc - 'a'] += 1;
        }
        for (int i = 0; i < 26; i++) {
            if (hashedarr[i] > 0) {
                System.out.println((char)(i + 'a') + " -> " + hashedarr[i]);
            }
    }
}
}