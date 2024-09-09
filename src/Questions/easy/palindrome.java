package Questions.easy;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(isValidate(str)==true){
            int n = Integer.parseInt(str);
            palindrome(n);
        }else {
            System.out.println("Not a valid input");
        }

    }
    public  static void palindrome(int n) {
        int t = n;
        int s = 0;
        while (t > 0) {
            int d = t % 10;
            t = t / 10;
            s = s * 10 + d;
        }
        if (s == n) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
        public static  boolean isValidate(String inp) {
            for (int i = 0; i < inp.length(); i++) {
                if (Character.isDigit(inp.charAt(i))==false) {
                    return false;
                }

            }
            return true;
        }
}
