package OOPs.Method_overriding;

class A {
    protected void msg() {
        System.out.println("Hello java");
    }
}

class Simple extends A {
    // Correctly overriding msg() with protected access
    protected void msg() { // we can use only public in place of protected because it's a stronger access type
        System.out.println("Hello java from Simple class");
    }

    public static void main(String args[]) {
        Simple obj = new Simple();
        obj.msg(); // Calls overridden msg() method in Simple class
    }
}
