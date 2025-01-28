package Questions.easy;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gcd = 0;
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = 1; i <= Math.min(n1,n2) ; i++) {
                if(n1%i==0 && n2%i==0){
                    gcd = i;
                }
        }
        System.out.println("the hcf is: "+gcd);
    }

}
