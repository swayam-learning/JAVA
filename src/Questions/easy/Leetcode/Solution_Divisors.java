package Questions.easy.Leetcode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution_Divisors {
    public static  List<Integer>printDivisors(int n) {
        // Write your code here
        List<Integer> lst = new ArrayList<>();
        for(int i =1;i*i<=n;i++){ //sqrt of n
            if(n%i==0){
                lst.add(i);
                if(n/i != i){
                    lst.add(n/i);
                }
            }
        }
        Collections.sort(lst);
        return lst;
    }

    public static void main(String[] args) {
        System.out.println(printDivisors(36));
    }
}
