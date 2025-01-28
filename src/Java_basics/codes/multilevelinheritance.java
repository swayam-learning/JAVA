package Java_basics.codes;


public class multilevelinheritance {
    public static void main(String[] args) {
        cat c1 = new cat();
        dog d1 = new dog();
        d1.making_dog_sound();
        d1.making_sound();
        c1.making_sound_cat();
    }
}
class animal{
    void making_sound(){
        System.out.println("the animal is making sound");
    }
}
class dog extends animal{
    void making_dog_sound(){
        System.out.println("the dog is making sound");
    }
}
class cat extends animal{
    void making_sound_cat(){
        System.out.println("the cat is making sound");
    }
}