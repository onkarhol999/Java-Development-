
class OnkarException extends Exception {

    public OnkarException(String string) {
        super(string);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0)
                throw new OnkarException("Can not devide by zero");
        } catch (OnkarException e) {
            System.out.println("Something went wrong" + e);
        }
        System.out.println("Program till Executed");
    }
}
