// Method Overriding and Polymorphism
// Create a superclass and a subclass. Override a method in the subclass and demonstrate runtime polymorphism using parent class reference and child class object.
class A {
    public void show() {
        System.out.println("Show method in parent class");
    }
}

class B extends A {
    public void show() {
        System.out.println("Show method in Child class");
    }
}

public class Fifth {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A obj1 = new B();
        obj1.show();
    }
}
