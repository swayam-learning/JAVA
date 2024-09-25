package Java_basics.codes.basic_class_objects;
public class classes_objects {
    public static void main(String[] args) {
        learning ln = new learning("swayam",21,42);
        ln.displayinfo();
        learning ln1 = new learning("swayam",22,"st paul's",42);
        ln1.displayinfo2();
    }
}
class learning{
    String name; //="swayam";
    int age;// = 21;
    int roll_no;// = 42;
    String school;

    //Prameterized constructor
    learning(String name1,int age1 ,int roll_no1){
        name = name1;
        age = age1;
        roll_no = roll_no1;

    }

//    constructor overloading
    learning(String name2,int age2,String school1,int roll_no2){
        name = name2;
        age = age2;
        school =school1;
        roll_no = roll_no2;

    }
    void displayinfo(){

        System.out.println("my name is "+name+" and i am "+age+"year's old "+",my roll no is "+roll_no);
    }
    void displayinfo2(){

        System.out.println("my name is "+name+" and i am "+age+"year's old "+",my roll no is "+roll_no+"i study in "+school);
    }
}
//if we don't provide any value then it will return null 0 0 because java's default constructor will fo the work
//in java we don't have return type for constructors we can use access modifiers with constructors/
//the constructor name must be same with the class name
//Does constructor return any value?
//Yes, it is the current class instance (You cannot use return type yet it returns a value).
//Can constructor perform other tasks instead of initialization?
//        Yes, like object creation, starting a thread, calling a method, etc.
//        You can perform any operation in the constructor as you perform in the method.