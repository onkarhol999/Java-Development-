public class DemoCalc {
    public static void main(String[] args) {
        AvdCalc obj = new AvdCalc();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(8, 4);
        int r3 = obj.mul(8, 4);
        int r4 = obj.div(8, 4);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}
