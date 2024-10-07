import java.util.*;

public class ArraySort2D {
    public static void main(String[] args) {
        int arr[][] = { { 2, 6 }, { 8, 3 }, { 9, 2 }, { 4, 5 } };

        Comparator<int[]> com = new Comparator<int[]>() {
            public int compare(int i[], int j[]) {
                return Integer.compare(i[1], j[1]);
            }
        };
        Arrays.sort(arr, com);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][1]);
        }
    }
}
