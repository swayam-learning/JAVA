package Java_basics.codes.OOPs.Inheritance;

public class Box_Weight extends Box{
        double weight;
        public Box_Weight(){
            this.weight = 20;
            this.w=w;

        }

    public Box_Weight(double l, double h, double w, double weight) {
        super(l, h, w); // ctrl+click on the super will tell where it origin is
        this.weight = weight;
        System.out.println(super.h);// we can also write this.h but if we want to explicitly call h from the parenr
        // class and avoid any confusion we use super keyword
        }
    Box_Weight(Box_Weight other){
            super(other);
            this.weight= other.weight;
    }

}
