
public class ThrowKeyword {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0)
                throw new ArithmeticException();
            System.out.println(j);
        } catch (ArithmeticException e) {
            System.out.println("Exception");
        }

        System.out.println("Program executed");
    }
}