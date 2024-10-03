
abstract class Computer {
    public abstract void code();
}

class Desktop extends Computer {
    public void code() {
        System.out.println("Code, Compile, Run : Faster");
    }
}

class Laptop extends Computer {
    public void code() {
        System.out.println("Code, Compile, Run");
    }
}

class Developer {
    public void devApp(Computer comp) {
        comp.code();
    }
}

public class Demo {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer onkar = new Developer();
        onkar.devApp(lap);
    }
}
