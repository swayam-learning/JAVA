package Java_basics.codes.inputs;

import java.util.Scanner;

public class inputting_scanner {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int roll_no = inp.nextInt();
        inp.nextLine(); // if we don't give this then the next line will not be consumed and we will not get desired
        // input
        String name = inp.nextLine();

        System.out.println("the name of the student is: "+name);
        System.out.println("the roll-no of the student is: "+roll_no);
    }
}
