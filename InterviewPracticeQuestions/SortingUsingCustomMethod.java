import java.util.*;

public class SortingUsingCustomMethod {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2 }, { 1, 6 }, { 1, 9 }, { 3, 6 }, { 2, 8 }, { 5, 6 } };

        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
        for (int n[] : arr) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
