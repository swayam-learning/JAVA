package Java_basics.codes.basic_class_objects;
public class working_on_constructors {
    public static void main(String[] args) {
        student.change(); // first we called the static function to change the name of the school
        student s1= new student("swayam",21);
        s1.display();
        student s2 = new student(s1,42);
        s2.display2();
        student s3 = new student();
        s3.name = "swarup";
        s3.age = 22;
        s3.display();
        System.out.println(student.school_name); // static variables do not need objects they belong to the class
        // also called class variables
        System.out.println(s3.school_name); // we can also call static variables using objects but class name is
        // generally preferred
    }
}
class student{
    String name; // instance variables
    int age; // instance variables
    int roll_no; // instance variables
    static String school_name = "St pauls"; // static variables shared among all the instance of a class
    static void change(){ // in order to change the static variable // we made it static so that this function is
        // shared among all
        school_name="lpu";
    }
    student(String n,int a){
        name = n; // local variables
        age = a;
    }
//copying values from first constructor  directly into the second constructor
    student(student s,int rno){
        name = s.name;
        age = s.age;
        roll_no = rno;
    }
    public student() {
    }
    void display(){
        System.out.println("the name is "+name+" the age is "+age+" and i study in "+school_name);
    }
    void display2(){
        System.out.println("the name is "+name+" the age is "+age+"the roll no is "+roll_no+" and i study in "+school_name);
    }
}
//instance variables are variables which are defined in a class and can be accessed within a class by everyone it is
// created for each object and acquires memory whenever an object is created in a class
//static variables are those which are created by using static keyword and is shared among all the instances of a
// class and acquires memory only once
//local variables are only limited to a method and acquires memory once
//all the objects are created and stored in the stack memory but all others are stored in the heap memory
// s1 object  here is stored in the stack memory
//but values like name = "swayam" are stored in the heap memory
//There are two main restrictions for the static method. They are:
// 1. The static method can not use non static data member or call non-static method directly.
// 2. this and super cannot be used in static context.