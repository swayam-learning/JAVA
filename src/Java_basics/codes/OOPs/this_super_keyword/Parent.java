package OOPs.this_super_keyword;
class TestSuper5{
    public static void main(String[] args){
        Emp e1=new Emp(23,"Swayam",45000f,42);
        Emp e2 = new Emp();
        e1.display();
        e2.display2();
    }}


class Person{
    int id;
    String name;
    Person(int id,String name){
        this.id=id;
        this.name=name;
    }
    Person(){

    }
}
class Emp extends Person{
    float salary;
    int roll_no;

    Emp(int id,String name,float salary,int roll_no){
        super(id,name);//reusing parent constructor
        this.salary=salary;
        this.roll_no=roll_no;
    }
    Emp(){// we cannot use this inside default constructor if we don't provide some value remove the value and just
        // use the variable name you will get error
            this(35);
        }


        Emp(int roll_no){
        this.roll_no = roll_no;
    }


    void display(){System.out.println(name+" "+id+" "+salary+" "+roll_no);}
    void display2(){System.out.println(roll_no);}
}
