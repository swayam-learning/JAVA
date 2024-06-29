package Java_basics.codes.OOPs.abstraction101.interfaces;

public class Multiple_inheritance_interfaces{
    public static void main(String[] args) {
        rectangle rec = new rectangle();
        rec.draw();
    }
}
interface shape{
    void draw();
}
interface shape1{
    void draw();
}
class rectangle implements shape,shape1{
    public void draw(){
        System.out.println("i am drawing the rectangle");
    }

}
