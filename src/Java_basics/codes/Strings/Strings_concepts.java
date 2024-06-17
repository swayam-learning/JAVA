package Java_basics.codes.Strings;

import java.util.ArrayList;

public class Strings_concepts {
    public static void main(String[] args) {
        float  num  = 23432.243243f;
        System.out.printf("Formatted value of the float for pretty printing %.2f\n",num);
        System.out.println(Math.PI);
        System.out.printf("Value of PI %.3f\n",Math.PI);
        System.out.printf("Hello my name is %s and i am %s\n","Swayam","cool");
        /* %c character
            %d decimal
            %e exponential
            %f floating
            %i integer
            %o octal
            %s string
            %u unsigned decimal
            %x Hexadecimal
            %t Date/time
         */
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));
        System.out.println("a"+1);//integer here will get converted into wrapper class //not possible in python
        System.out.println("Swayam"+ new ArrayList<>());
//        System.out.println(new Integer(56)+new ArrayList<>()); // this will give error at least one value should have been string
        System.out.println((567)+" "+new ArrayList<>());
        System.out.println(" "+(567)+new ArrayList<>());
        // in java operator overloading is not applicable but in c++ it is applicable but it is applicable only for + operator
        System.out.println('a'+1);// a is converted to ascii value
        System.out.println((char)('a'+1));

    }
}
