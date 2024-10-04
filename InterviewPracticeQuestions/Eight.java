// Interface with Multiple Inheritance
// Write a Java program that implements two interfaces and demonstrates multiple inheritance using the interfaces.

interface A {
    void Animal();
}

interface B {
    void Dog();
}

interface C {
    void Cat();
}

class D implements A, B, C {
    public void Animal() {
        System.out.println("Animals");
    }

    public void Dog() {
        System.out.println("Dog are nice");
    }

    public void Cat() {
        System.out.println("Cats are good");
    }
}

public class Eight {
    public static void main(String[] args) {
        D obj = new D();
        obj.Animal();
        obj.Cat();
        obj.Dog();
    }
}
