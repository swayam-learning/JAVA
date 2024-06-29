package Java_basics.codes.OOPs.method_overloading;

class OverloadingCalculation2{
    void sum(int a,int b){System.out.println("int arg method invoked");}
    void sum(float a,float b){System.out.println("float arg method invoked");}

    public static void main(String args[]){
        OverloadingCalculation2 obj=new OverloadingCalculation2();
        obj.sum(20,20);//now int arg sum() method gets invoked
    }
}