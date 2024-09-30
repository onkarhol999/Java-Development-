class A {
    public A() {
        System.out.println("in A");
    }

    public A(int n) {
        System.out.println("in parameterized A");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("in B");
    }

    public B(int n) {
        this();
        System.out.println("in parametarised B");
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        B obj = new B(8);
        // System.out.println("Onkar");
    }
}
