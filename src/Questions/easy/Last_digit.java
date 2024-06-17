package Questions.easy;

import java.util.Scanner;

public class Last_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = Math.abs(a)%10;
        System.out.println("the last digit of the number entered is "+n);
    }
}
