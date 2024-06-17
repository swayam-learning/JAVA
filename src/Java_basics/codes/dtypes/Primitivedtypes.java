package Java_basics.codes.dtypes;


public class Primitivedtypes {
    public static void main(String[] args) {
        //--------Primitive Data Types--------
        /* boolean : true or false
            byte : -2^7 to (2^7)-1 8 bit long
            char: single character
            short : -2^15 to (2^15)-1 16 bit long
            int : -2^31 to (2^31)-1 32 bit long
            long : -2^63 to (2^63)-1 864 bit long
            for bigger integer value more than long we can use biginteger
            float : single precision  32 bit
            double : double precision 32 bit
            character : 16 bit unicode character('\u0000' to '\uffff')
         */
        /* primitive data types are stored in the stack memory and if we don't initialize it will give **compiler** error*/
        int x=10;
        int y=20;
        System.out.println(x);
        System.out.println(y);
        int x1=x;// here the initial value of x1 becomes 10 but then  it is initialized again in the next line
        //and there is alo no change in the value of x due to x1 because primitives do not use the concept of references
        x1=30;
        System.out.println(x1);

    }
}
