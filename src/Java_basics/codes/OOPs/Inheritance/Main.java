package Java_basics.codes.OOPs.Inheritance;

public class Main{
    public static void main(String[] args) {
//        Box box1 = new Box(); //creation of object
//        System.out.println(box1.w);
//        Box box2 = new Box();
//        System.out.println(box2.l);
//        Box_Weight box2 = new Box_Weight();
//        System.out.println(box2.w+" "+box2.weight);
//        System.out.println(box2.l+" "+box2.weight); will give error because l is private type
        // parents will not be able to access child class properties
        Box box3  = new Box_Weight(10,20,30,40);
        System.out.println(box3.w);
//        System.out.println(box3.weight); this gives error because even though we have created an object using the
//        Box_weight it doesn't matter the object can only  access those variables which are in it's reference variable
        // parents will not be able to access child class properties anyway
        Box_Weight otherweight = new Box_Weight();// first we created this to have access to weight form Box_weight
        Box_Weight b4 = new Box_Weight(otherweight); // now we created this to have access to l,h,w from the parent
        // class Box
        System.out.println(b4.weight+" "+b4.h);

    }
}
