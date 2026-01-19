package Revise.inheritance.super_;

class vehicle1{
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
    String numberofCars;
    public cars1(String numberofCars){
        super(numberofCars);
    }
    // public void prinNumberPlate(){
    //     System.out.println(this.numberofCars);
    // } this will be uselss as we are not assigning this.numberofCars = numberofCars

}
public class inherit{
    public static void main(String[] args) {
        cars1 c1 = new cars1("KKKFEFEW");
        c1.prinNumberPlate();
        c1.honk();
    }
}
