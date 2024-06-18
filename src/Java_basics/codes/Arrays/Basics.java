package Java_basics.codes.Arrays;

public class Basics {
    public static void main(String[] args) {
        int[] a = {10,20,30,40};
        System.out.println(a.length);
        System.out.println(a[1]);
        int[] b = new int[3];
        int x =10;
        for (int i = 0; i < b.length; i++) {
            b[i] = x;
            x=x*10;

        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
    }
}
