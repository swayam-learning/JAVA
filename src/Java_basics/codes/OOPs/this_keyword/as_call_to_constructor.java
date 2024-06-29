package Java_basics.codes.OOPs.this_keyword;

public class as_call_to_constructor {
    public static void main(String[] args) {
    student s1 = new student(5);

    }
}
class student{
    String name;
    int age;
    int roll_no;
    student(){
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
        System.out.println("i have been invoked");
    }
    student(int x){
        this();//calling the previous constructor // this needs to be always the first line if we move it to anyother
        // place we get compilation error
        System.out.println("Printing the value of x"+x);
//        this();//compiler error
    }
}