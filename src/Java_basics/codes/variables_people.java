package Java_basics.codes;

public class variables_people {
    static int TotalPeople = 0; //static variables
    String name; //instance variables
    int age;//instance variables
    variables_people(String name, int age){
        this.name=name;
        this.age = age;
        TotalPeople++;
    }
    public static void main(String[] args) {
        variables_people person1 = new variables_people("swayam",21);
        variables_people person2 = new variables_people("swarup",22);
        System.out.println(person1.name+" "+person1.age);
        System.out.println(person2.name+" "+person2.age);
        System.out.println(TotalPeople);
        int money_earned =10000; //local people
        System.out.println(money_earned);
    }
}
