package Java_basics.codes.dtypes;

public class NonPrimitivedtypes {
    public static void main(String[] args) {
        point p1 = new point();
        p1.x=10;
        p1.y=20;
        point p2=p1;
        p2.y=30;
        System.out.println(p1.x);
        System.out.println(p1.y);
        System.out.println(p2.y);

    }

}
class point{
    int x;
    int y;
}
// non primitive data types are stored in heap memory and  we do not have to initialise them