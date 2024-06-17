package Java_basics.codes.Strings;
public class strings_basics {
    public static void main(String[] args) {
        String name_a= "swayam";
        String name_c="swarup" ;
        String name_b = "swayam";
        System.out.println(comparator(name_a,name_b));
        /* when we create a string the object is stored inside a
         string pool inside the heap memory so a and b
         are stored inside stack memory
         and when we compare them they point to the same object inside the string pool
        */
        /* when we say strings are immutable it means we cannot change anything  but if declare a="Barik"
          here it will work because here we are working with a different object within the same string pool**/

        /* when we use == operator it checks whether then reference variable are pointing to the same object**/

        /* we can also try to create two string objects which can have the same object value
         but will point two different objects inside the
         heap memory as it is created outside of the string pool**/
        String_checker(name_a,name_b);// this will result false because now its pointing to two different objects
    }
    /* now == and equals
    the == operator checks for if the reference variable pointing towards the same object
    the equals() only checks the value so in both cases equals would have given true
     */
    static boolean comparator(String a , String b){
       if(a==b){
           return true;
       }
       return false;
    }
    static void String_checker(String name_a, String name_b){
        String a = new String("Swayam");
        String b = new String("Swayam");
        // now here the objects are created outside the string pool and the reference variable are pointing towards two different objects
        System.out.println(comparator(a,b));
        System.out.println("After checking using equals operator which only checks the value it became true");
        System.out.println(a.equals(b));
        System.out.println(a.charAt(0));
    }
}