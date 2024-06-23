package OOPs.abstraction101.interfaces;

public class Test {
    public static void main(String[] args) {
        Sbi sbi = new Sbi();
        Pnb pnb = new Pnb();
        System.out.println(sbi.getRateOfInterest());
        System.out.println(pnb.getRateOfInterest());
        bank obj = new bank() {
            @Override
            public int getRateOfInterest() {
                return 12;
            }
        };
    }
}
interface bank{
    int getRateOfInterest();
//    void func(){
//        System.out.println("hey");
//    }
//    Interface abstract methods cannot have body : error
}
class Sbi implements bank{
    public int getRateOfInterest(){ // always public
        return 7;
    }
}
class Pnb implements bank{
    public int getRateOfInterest(){
        return 8;
    }
}