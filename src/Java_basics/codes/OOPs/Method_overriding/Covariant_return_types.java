package OOPs.Method_overriding;
public class Covariant_return_types {
    public static void main(String[] args) {
        a obj = new a();
        obj.printing();
        obj =  new b();
        obj.printing();
        obj = new c();
        obj.printing();
    }
}
class a{
    void printing(){
        System.out.println("printing a class");
    }
}
class b extends a{
    void printing(){
        System.out.println("printing b class");
    }
}
class c extends b{
    void printing(){
        System.out.println("printing c class");
    }
}
//this above code is basically multilevel inheritance where a is the generic-parent of both b and c, c is the direct
// parent of class b we are overriding the function func to get different outputs in different cases
//we cannot do method overridng on static variables because they are common to a class and shared among all the objects