package Questions.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum_of_first_n_digits {
    static int  sum(int n){
        if(n%2==0)
            return (n/2)*(n+1);
        else
            return ((n+1)/2)*n;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        System.out.println("the sum of first "+a+" numbers is "+sum(a));

    }
}
