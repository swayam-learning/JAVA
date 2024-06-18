package Java_basics.codes.Final_Keyword;

public class Final_in_objects {
    public static void main(String[] args) {
        // we cannot a method if it is final or we cannot inherit from a final class
        final StringBuilder sb = new StringBuilder("Geeks");

        // Printing the element in StringBuilder object
        System.out.println(sb);

        // changing internal state of object reference by
        //  final reference variable sb
        sb.append("ForGeeks"); //this property is called non-transitivity

        // Again printing the element in StringBuilder
        // object after appending above element in it
        System.out.println(sb);
    }
//    When a final variable is a reference to an object, then this final variable is called the reference final variable. For example, a final StringBuffer variable looks
//    defined below as follows:
//
//    final StringBuffer sb;
//
//    As we all know that a final variable cannot be re-assign. But in the case of a reference final variable, the internal state of the object pointed by that reference
//    variable can be changed. Note that this is not re-assigning. This property of the final is  called non-transitivity
//    The non-transitivity property also applies to arrays, because []arrays are objects in Java.Arrays with the
//    final keyword are also called Final arrays
//

}
