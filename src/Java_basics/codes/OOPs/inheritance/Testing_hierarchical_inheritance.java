package OOPs.inheritance;

public class Testing_hierarchical_inheritance {
    public static void main(String[] args) {
        puppy p1= new puppy();
        p1.weeping();
        p1.eating();
        p1.barking();
    }
}

class animal2{
    void eating(){
        System.out.println("now eating");
    }

}
class dog2 extends animal2{
    void barking(){
        System.out.println("now barking");
    }
}
class puppy extends dog2{
    void weeping(){
        System.out.println("now weeping");
    }
}
