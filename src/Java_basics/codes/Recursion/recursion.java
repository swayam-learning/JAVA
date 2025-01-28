package Java_basics.codes.Recursion;

public class recursion {
    public static void main(String[] args) {
        recursion1 r1 = new recursion1();
        System.out.println(r1.fact(3));

    }
}
class recursion1{
    int fact(int n){
        if(n==0){
            return 1;
        }
        else {
            return fact(n-1)*n;
        }
    }
}