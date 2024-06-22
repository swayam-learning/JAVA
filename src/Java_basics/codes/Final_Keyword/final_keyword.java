//package Java_basics.codes.Final_Keyword;
//
//public class final_keyword {
//    public static void main(String[] args) {
//        for (final int i = 2; i <10 ; i++) {//we cannot reassign a final variable

//            System.out.println(i);

//        }
//        Final Variable -----> To Create constant variable
//        Final Methods ------> To Prevent Method Overriding
//        Final Classes ------> To Prevent Inheritance
//    }
//}
// Q) Is final method inherited?
// Ans) Yes, final method is inherited but you cannot override it. For Example:

// class Bike{  
//   final void run(){System.out.println("running...");}  
// }  
// class Honda2 extends Bike{  
//    public static void main(String args[]){  
//     new Honda2().run();  
//    }  
// // }  
// Que) Can we initialize blank final variable?
// Yes, but only in constructor. For example:

// class Bike10{  
//   final int speedlimit;//blank final variable  
    
//   Bike10(){  
//   speedlimit=70;  
//   System.out.println(speedlimit);  
//   }  
  
//   public static void main(String args[]){  
//     new Bike10();  
//  }  
// }  
// static blank final variable
// A static final variable that is not initialized at the time of declaration is known as static blank final variable. It can be initialized only in static block.

// Example of static blank final variable
// class A{  
//   static final int data;//static blank final variable  
//   static{ data=50;}  
//   public static void main(String args[]){  
//     System.out.println(A.data);  
//  }  
// }  
// Q) Can we declare a constructor final?
// No, because constructor is never inherited.
