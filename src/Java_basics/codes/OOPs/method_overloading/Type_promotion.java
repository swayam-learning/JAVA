package Java_basics.codes.OOPs.method_overloading;

class OverloadingCalculation1{
    void sum(int a,float b){System.out.println(a+b);}
    void sum(int a,int b,int c){System.out.println(a+b+c);}

    public static void main(String args[]){
        OverloadingCalculation1 obj=new OverloadingCalculation1();
        obj.sum(20,20);//now second int literal will be promoted to float
        obj.sum(20,20,20);

    }
}