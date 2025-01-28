package Java_basics.codes.output_formatting;


public class output_formatting {
    public static void main(String[] args) {
        int x =100;
        System.out.printf("the number is going to have 2 decimal places %.3f\n",(float)x);
        System.out.printf("the number is going to have 2 decimal places %20.2f\n",(float)x); // here the defines the
        // width

    }
}
