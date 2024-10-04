// Abstract Class Implementation
// Define an abstract class with both abstract and non-abstract methods. Create a subclass that implements the abstract methods and invoke the methods using the subclass.

abstract class A {
    public abstract void show();

    public abstract void sleep();
}

class B extends A {
    public void show() {
        System.out.println("Showing.......");
    }

    public void sleep() {
        System.out.println("Sleeping.........");
    }
}

public class Seven {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.sleep();
    }
}
