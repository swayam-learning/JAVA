package OOPs.instance_initializer_block;

class A{
    A(){
        System.out.println("parent class constructor invoked");
    }
}

class B3 extends A{
    B3(){
        super();
        System.out.println("child class constructor invoked");
    }

    B3(int a){
        super();
        System.out.println("child class constructor invoked "+a);
    }

    {System.out.println("instance initializer block is invoked");}

    public static void main(String args[]){
        B3 b1=new B3();
        B3 b2=new B3(10);
    }
}
//There are mainly three rules for the instance initializer block. They are as follows:

// 1. The instance initializer block is created when instance of the class is created.
// 2. The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super()
// constructor call).
// 3. The instance initializer block comes in the order in which they appear.(because compiler first makes a super()
// then copies the instance initializer block and then the constructor block