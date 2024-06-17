package Questions.easy;

public class swap_two_numbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp =0;
        temp = b;
        b= a;
        a = temp;
        System.out.println("We have swapped the numbers");
        System.out.println("the numbers are a: "+ a +" "+"and b: "+ b);
    }
}
