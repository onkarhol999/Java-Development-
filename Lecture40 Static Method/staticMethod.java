class staticMethodClass {
    static String name;
    int price;
    int battery;

    public void show() {
        System.out.println(name + " : " + price + " : " + battery);
    }

    public static void show1(staticMethodClass obj) {
        System.out.println(name + " : " + obj.price + " : " + obj.battery);
    }
}

public class staticMethod {
    public static void main(String[] args) {

        staticMethodClass.name = "Iphone";

        staticMethodClass m1 = new staticMethodClass();
        m1.battery = 6000;
        m1.price = 160000;
        staticMethodClass m2 = new staticMethodClass();
        m2.battery = 6000;
        m2.price = 160000;
        staticMethodClass m3 = new staticMethodClass();
        m3.battery = 6000;
        m3.price = 160000;

        // m1.show();
        // m2.show();
        // m3.show();
        staticMethodClass.show1(m1);
        staticMethodClass.show1(m2);
        staticMethodClass.show1(m3);
    }
}
