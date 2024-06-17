package Java_basics.codes.functions;

public class Internal_working_functions {
    public static void main(String[] args) {
        int a =10;
        int b=20; //there copies are passed as value to the swap() so they remain intact
        //a----->10 b---->20
        swap(a,b);//this is just useless
        System.out.println("the original values remains the same "+a+" "+b);//the value has not been swapped
        // here the original value is still intact a----->10 b---->20
    }
    static void swap(int a , int b) {
        int temp = a;
        a=b;
        b=temp;
        System.out.println("the fake updation of values "+a+" "+b);
        //  a----->20 b----->10
//  here in this step we are not changing the original value rather we are working on a copy of the reference so in terms here a=20 and b=10 but
//  the original value of a and b in  the main function still holds true
        // strings are final classes we cannot modify
    }
//public static void main(String[] args) {
//    int arr[] = {2,13,24,45};
//    change(arr);
//    System.out.println(Arrays.toString(arr));
//}
//static void change(int a[]){
//    a[0]=99;//here we are not creating a new object rather we are making change in the original object
////    int ar[]={3, 24, 56, 78};//here the original array will remain intact because we are creating a new object
//}
//// scoping basically that the scope of a variable is limited within scope
}
