package Java_basics.codes.OOPs.Inheritance;

public class Box {
        private double l; // if we make this private it won't be accessible outside this class
        double w;
        double h;

        Box() {
            this.h = 10;
            this.l = 10;
            this.w = 10;

        }
        Box(double side){
            this.w = side;
            this.l = side;
            this.h=side;

        }
        Box(double l, double h, double w){
            this.l = l;
            this.h= h;
            this.w = w;

        }
        Box(Box old){
            this.l = old.l;
            this.h = old.h;
            this.w = old.w;
        }
    }