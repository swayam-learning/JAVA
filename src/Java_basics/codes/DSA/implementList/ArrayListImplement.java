package Java_basics.codes.DSA.implementList;

import java.util.Arrays;

public class ArrayListImplement {
    private int arr[];
    private int capacity;
    private int currentsize;
    private static final int DEFAULT = 10;
     public ArrayListImplement(){
         arr = new int[DEFAULT];
         capacity = DEFAULT;
         currentsize =0;
     }
     public  ArrayListImplement(int cap){
         arr = new int[cap];
         capacity = cap;
         currentsize = 0;
     }
     public void add(int data){
//         System.out.println("capacity"+capacity);
         if (currentsize==capacity){
             int[] oldArr = arr;
             arr = new int[2*capacity];
             for (int i = 0; i < capacity; i++) {
                 arr[i]= oldArr[i];
             }
             oldArr = null ;// garbage collector collects it
             capacity = 2*capacity;
         }
         arr[currentsize] = data;
         currentsize++;
     }
     public void remove(){
      currentsize--;
     }
     public int get(int i){
         return arr[i];
     }
     public int getCapacity(){
         return capacity;
     }
     public int size(){
         return currentsize;
     }

    public static void main(String[] args) {
       ArrayListImplement ar = new ArrayListImplement(5);
       ar.add(5);
       ar.add(2);
       ar.add(23);
       ar.add(43);
       ar.add(345);
        System.out.println("old Size "+ar.size());
        System.out.println("old capacity "+ar.getCapacity());
        ar.add(3454);// here we will double the capacity
        System.out.println("new capacity "+ar.getCapacity());
        System.out.println("new Size "+ar.size());
        ar.remove();
        ar.add(89);
        for (int i = 0; i < ar.size() ; i++) {
            System.out.print(ar.get(i) + " ");
        }
    }
}
