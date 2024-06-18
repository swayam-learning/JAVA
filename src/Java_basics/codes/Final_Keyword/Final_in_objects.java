package Java_basics.codes.Final_Keyword;

public class Final_in_objects {
    public static void main(String[] args) {
        // we cannot a method if it is final or we cannot inherit from a final class
        final StringBuilder sb = new StringBuilder("Geeks");

        // Printing the element in StringBuilder object
        System.out.println(sb);

        // changing internal state of object reference by
        //  final reference variable sb
        sb.append("ForGeeks");

        // Again printing the element in StringBuilder
        // object after appending above element in it
        System.out.println(sb);
    }
}
