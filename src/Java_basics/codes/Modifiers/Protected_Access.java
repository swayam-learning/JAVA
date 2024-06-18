package Java_basics.codes.Modifiers;
public class Protected_Access extends Protected_class{
    public static void main(String[] args) {
        Protected_class.b b2 = new Protected_class.b();
        b2.fun(); // this was accessible because it was inside the same package and was in protected
    }
}
