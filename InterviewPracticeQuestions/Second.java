// Demonstrate Stack and Heap Memory
// Write a Java program that shows the difference between stack memory and heap memory. Use methods that involve both primitive data types and objects.

class A {
    String name; // This field is stored in heap memory as part of the object
    int id = 12; // This field is stored in heap memory as part of the object

    public void show() {
        // Local primitive variables 'a' and 'b' are stored in the stack
        int a = 10;
        int b = 20;
        System.out.println("A : " + a); // Stack variable 'a' is used here
    }
}

public class Second {
    public static void main(String[] args) {
        // 'obj' is a reference stored in the stack, pointing to an object in the heap
        A obj = new A();

        // Accessing the 'id' field, which is stored in heap memory
        int id = obj.id;

        // Invoking method 'show', which works with stack memory for its local variables
        obj.show();

        // 'id' is stored in the stack (as it is a primitive inside the main method)
        System.out.println("ID : " + id);
    }
}
