package Revise.polymorphism;
class vehicle1{
    // Base Class
    String numberofVehicle;
    public vehicle1(String numberofVehicle){
        this.numberofVehicle= numberofVehicle;
    }

    public void honk(){
        System.out.println("Honking !!!!!!!!!!");
    }
    public void prinNumberPlate(){
        System.out.println(this.numberofVehicle);
    }
    
}
class cars1 extends vehicle1 {
    // Derived Class
    String numberofCars;
    public cars1(String numberofCars){
        super(numberofCars);
    }
    @Override
    public void honk(){
        System.out.println("Honk differently");
    }
}
class bus extends vehicle1 {
    // Derived Class
    String numberofBus;
    public bus(String numberofBus){
        super(numberofBus);
    }
}
public class poly {
        public static void main(String[] args) {
        cars1 c1 = new cars1("KKKFEFEW");
        c1.prinNumberPlate();
        c1.honk();


        bus b1 = new bus("KKKFEFEW");
        b1.prinNumberPlate();
        b1.honk();
    }
}
