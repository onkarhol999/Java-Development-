
interface A {
    void show();

    void speek();
}

class B implements A {
    public void show() {
        System.out.println("in Show");
    }

    public void speek() {
        System.out.println("Printing..");
    }
}

public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.speek();
    }
}
