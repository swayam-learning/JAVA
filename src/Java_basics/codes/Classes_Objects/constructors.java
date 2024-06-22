package Java_basics.codes.Classes_Objects;

public class constructors {
    public static void main(String[] args) {
        point p1 = new point(10,20);//parameterised constructors
        p1.print();
        point1 p2 = new point1();//default constructors
        p2.print();
        point2  p3= new point2();//if we have made any constructor within the class java will not make its own
        // default constructor
        p3.print();
    }
}
class point{

    int x,y;
    //Parameterised constructor
    public point(int a ,int b) {
        x =a;
        y=b;
    }

    void print(){
        System.out.println(x+" "+y);
    }
}
class point1{
    // in this case we have not made any constructor so java by default uses default constructors and assigns default
    // values in them
    int x,y;
    void print(){
        System.out.println(x+" "+y);
    }
}

class point2{
    int x,y;
    point2 (){
        int a=10;int b=20;
        x= a;
        y= b;
    }
    void print(){
        System.out.println(x+" "+y);
    }
}