package Java_basics.codes.Static_members;

public class Static_concepts {

    public static void main(String[] args) {
        Population p1= new Population();//objects are always created using the new keyword
        p1.Population_Increase("swayam",20);
        p1.Print();
        p1=new Population();//reusing the same object-name for different objects
        p1.Population_Increase("Swarup",21);
        p1.Print(); // we can see the static variable was shared among the objects of the same class
        System.out.println(Population.TotalPeople);//we can access the static variable using class name
        System.out.println(p1.TotalPeople);// we can use object name
        System.out.println(Population.getTotalPeople_Private()); // we made it private so had to use another function
    }
}
class Population{
    static int TotalPeople = 0;//static variables
    private static int TotalPeople_Private=0;
    String Name;//instance variables
    int age;
   void Population_Increase(String Name,int age){//constructors
        this.Name = Name;
        this.age = age;
        TotalPeople++;
        TotalPeople_Private++;
    }
    void Print() {
        System.out.print(this.Name+" ");
        System.out.print(this.age+" ");
        System.out.println(TotalPeople);
        // Non-Static function can have access to both static and non-static variables
    }
    static int getTotalPeople_Private(){
       //static variables are class specific hence called  class variables
        // they do not use this. keyword as they can be access without objects
       return TotalPeople_Private; //static method have access to only static variables
    }
}
//Static variables are associated with the class and are, therefore, not allowed inside a method body.