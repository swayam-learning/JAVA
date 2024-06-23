package Java_basics.codes.Modifiers;

public class Protected_class {
    public static void main(String[] args) {
        b b1= new b();
        b1.fun();
    }

    public static class b { // this is public class can be accessed anywhere
        protected void fun() {
            System.out.println("Protected Package");
        }
    }
}
// the protected modifier states that we can access the functions , within the same package or child of the classes
