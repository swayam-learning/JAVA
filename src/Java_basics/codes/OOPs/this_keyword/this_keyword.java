package Java_basics.codes.OOPs.this_keyword;

public class this_keyword {
    public static void main(String[] args) {
        vidyarthi vd = new vidyarthi("swayam",22,43);
        vd.display_info();
    }
}

class vidyarthi{
    String name;
    int age;
    int roll_no;
    vidyarthi(String name, int age,int roll_no){
        this.name = name;  // this keyword is used to distinguish class variables from local variables
        this.age= age;// if the name of the local variables is different we didn't need to use this keyword
        this.roll_no = roll_no;
    }
    void display_info(){
        System.out.println("My name is "+this.name+" ,my age is "+this.age+" ,my rollno is "+this.roll_no);
    }

}