
interface Computer {
    void code();
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Code, Compile, Run : Faster");
    }
}

class Laptop implements Computer {
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
        onkar.devApp(desk);
    }
}
