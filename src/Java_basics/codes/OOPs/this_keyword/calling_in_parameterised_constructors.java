package OOPs.this_keyword;
public class calling_in_parameterised_constructors {
    public static void main(String[] args) {
        student1 s1 = new student1("swayam",21,42,"st pauls's");
    }
}
class student1{
    String name;
    int age;
    int roll_no;
    String school;
    student1(String name, int age,int roll_no){
//        this(name,age,roll_no,school); //this cannot be done because we cannot call a variable before the constructor
//        has been invoked
        this.name = name;
        this.age = age;
        this.roll_no =roll_no;
        disply_info();
    }
    student1(String name,int age,int roll_no,String school){//method overloading
        this(name,age,roll_no); //Rule: Call to this() must be the first statement in constructor.
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
        this.school = school;
        System.out.println("the school name is "+school);
    }
    void disply_info(){
        System.out.println("name is: "+name);
        System.out.println("age is: "+age);
        System.out.println("roll_no is: "+roll_no);
    }
}
//Rule: Call to this() must be the first statement in constructor.