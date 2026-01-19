package Revise.inheritance;
class vehicle{
    public void honk(){
        System.out.println("Honking !!!!!!!!!!");
    }
}
class cars extends vehicle {
    String number;
    public cars(String number){
        this.number= number;

    }
    public void prinNumberPlate(){
        System.out.println(this.number);
    }

}
public class inheritance {
    public static void main(String[] args) {
        cars c1 = new cars("KKKFEFEW");
        c1.prinNumberPlate();
        c1.honk();
    }
}

