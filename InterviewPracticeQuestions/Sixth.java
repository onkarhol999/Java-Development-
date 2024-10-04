// use of super() and this()
// Write a Java program to demonstrate the use of super() and this() for constructor chaining in inheritance.

class A {
    A() {
        System.out.println("Default  =  A ");
    }

    A(int id) {
        System.out.println("Paramitarized  =  A");
    }
}

class B extends A {
    B() {
        super();
        System.out.println("Default = B");
    }

    B(int id) {
        super(3);
        System.out.println("Paramitarized = B");
    }
}

public class Sixth {
    public static void main(String[] args) {
        // A obj = new A();
        B obj1 = new B();
        B obj2 = new B(4);
    }
}
