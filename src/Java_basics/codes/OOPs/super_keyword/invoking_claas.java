package Java_basics.codes.OOPs.super_keyword;

public class invoking_claas {
    public static void main(String[] args) {

        dog2 d2 = new dog2();

    }
}

class animals{
    animals(){
        System.out.println("the animal no 1 is created");
    }
    void func2(){
        System.out.println("The animal no 2 is created");
    }
}
class dog2 extends animals{
    dog2(){
        super(); // even if we don't write super it is provided explicitly
        super.func2();
        System.out.println("the dog is created");
    }
}