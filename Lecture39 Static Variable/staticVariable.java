//count number of object that are created 
// class myClass {
//     static int count = 0;

//     myClass() { // when ever the new object created it will increase the count
//         count++;
//     }
// }

class myClass {
    static String name;
    int price;
    int battery;

    public void show() {
        System.out.println(name + " : " + price + " : " + battery);
    }
}

public class staticVariable {
    public static void main(String[] args) {

        myClass.name = "Iphone";

        myClass m1 = new myClass();
        m1.battery = 5000;
        m1.price = 150000;
        myClass m2 = new myClass();
        m2.battery = 6000;
        m2.price = 160000;
        myClass m3 = new myClass();
        m3.battery = 7000;
        m3.price = 170000;

        m1.show();
        m2.show();
        m3.show();
    }
}
