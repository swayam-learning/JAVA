package Java_basics.codes.Classes_Objects;

public class this_keyword {
    public static void main(String[] args) {
        pointer p = new pointer(30,40);
        p.print();
        pointer1 p1 = new pointer1(30,40);
        p1.print();
        pointer2 p2 = new pointer2(30,40);
        p2.print();
        p2.setX(2).setY(3);//chaining of functions possible using this reference
        p2.print();
        pointer3 p3 = new pointer3(20,30);
        p3.print();
        pointer3 p4 = new pointer3();
        p4.print();
        Test object = new Test();
        object.get();
        object.get().display();//chaining of functions possible using this reference

    }
}
class pointer{
    int x =10;int y=20;
    public pointer(int a,int b){
        x=a;
        y=b;
        // here we see that the class objects override the class variable x and y values to avoid this we can use
        // this keyword
    }
    void print(){
        System.out.println(x+" "+y);
    }
}
class pointer1{
    int x =10;int y=20;
    public pointer1(int a,int b){
        this.x=x;
        this.y=y;//the value is retained
    }
    void print(){
        System.out.println(x+" "+y);
    }

}


// changing the value of x using this keyword
class pointer2{
    int x =10;int y=20;
    public pointer2(int x,int y){
        this.x=x;
        this.y=y;
    }
    pointer2 setX(int x){
        this.x=x; // Note: it's not necessary to use this.x we could have also used x= new_x and then return x
        return this; // this line return value of x if we write this.x it will return pointer2 object
    }
    pointer2 setY(int y){
        this.y = y;// Using 'this' to refer to the instance variable
        return this;
    }
    void print(){
        System.out.println(x+" "+y);
    }
}
//When parameter names are the same as instance variable names, "this" is used to distinguish between the instance
// variables and the parameters.
//java
//Copy code
//public pointer2(int x, int y) {
//    this.x = x; // 'this.x' refers to the instance variable
//    this.y = y; // 'y' refers to the constructor parameter
//}

//this keyword can be used to change the values

class pointer3{
    int x,y;
    pointer3(int x ,int y){//method overloading
        this.x=x;
        this.y=y;
    }
    pointer3(){
        this(100,200);

    }
    void print(){
        System.out.println(x+"  "+y);
    }
}


//Java code for using 'this' keyword
//to return the current class instance
class Test
{
    int a;
    int b;

    //Default constructor
    Test()
    {
        a = 10;
        b = 20;
    }

    //Method that returns current class instance
    Test get()
    {
        return this;
    }

    //Displaying value of variables a and b
    void display()
    {
        System.out.println("a = " + a + "  b = " + b);
    }

}
