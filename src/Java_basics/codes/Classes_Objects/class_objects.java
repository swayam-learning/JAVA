package Java_basics.codes.Classes_Objects;

public class class_objects {
    public static void main(String[] args) {
        complex c1 = new complex(10,20);
        c1.print();
        complex c2 = new complex(20,30);
        c1.add(c2);
        c1.print();

    }
}
class complex{
    int real ,imag;
    void print(){
        System.out.println(real+" +i"+imag);
    }
    complex(int r,int i){
        //constructor is a function which same name as class and has no return type
        real = r;
        imag = i;
    }
    void add(complex c){
        real = real + c.real; // here c.real is used to access that value
        imag = imag + c.imag;
    }
}