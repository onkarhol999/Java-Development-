class claculator {
    public int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}

class DemoClass {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        claculator clac = new claculator();
        int result = clac.add(num1, num2);
        System.err.println(result);
    }
}