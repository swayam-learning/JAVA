package Java_basics.codes.Modifiers;

public class Private_access {
    public static void main(String[] args) {
        private_modifier pv= new private_modifier();
//        System.out.println(pv.x);// error because it is not possible to access a private variable outside of it's
//        class
        pv.get_x();
    }
}
class  private_modifier{
    private int x=10;
    void get_x(){
        System.out.println(x);
    }

}
