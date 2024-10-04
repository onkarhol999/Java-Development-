// Static Variables and Methods
// Write a Java program to demonstrate the use of static variables and static methods. Create a class that counts the number of objects created using a static variable.

class Demo {
    static int count = 0;

    Demo() {
        count++;
    }

    static int getCount() {
        return count;
    }
}

public class Third {
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        Demo obj3 = new Demo();
        Demo obj4 = new Demo();
        System.out.println(Demo.getCount());
    }
}
