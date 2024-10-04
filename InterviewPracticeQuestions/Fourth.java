// Constructor Overloading
// Implement a class with multiple constructors (default and parameterized). Show how constructor overloading works by creating objects with different parameters.

class Demo1 {
    // Default constructor
    Demo1() {
        System.out.println("Default Constructor");
    }

    // Parameterized constructor
    Demo1(String name) {
        System.out.println("Parameterized Constructor: " + name);
    }
}

public class Fourth {
    public static void main(String[] args) {
        // Calling the default constructor
        Demo1 obj1 = new Demo1(); // Default Constructor

        // Calling the parameterized constructor
        Demo1 obj2 = new Demo1("Onkar"); // Parameterized Constructor
    }
}
