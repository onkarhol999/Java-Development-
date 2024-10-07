import java.util.*;

public class SortStringOnBasisOfThereLength {
    public static void main(String[] args) {
        // String arr[] = { "Onkar", "Priya", "Abhijeet", "Jay", "Sawnand" };
        // Comparator<String> com = new Comparator<String>() {
        // public int compare(String i, String j) {
        // return Integer.compare(i.length(), j.length());
        // }
        // };

        // Arrays.sort(arr, com);
        // for (String s : arr) {
        // System.out.println(s);
        // }

        int arr[][] = { { 9, 8 }, { 6, 7 }, { 2, 3 }, { 1, 2 } };

        Comparator<int[]> com = new Comparator<int[]>() {
            public int compare(int i[], int j[]) {
                return Integer.compare(i[1], j[1]);
            }
        };
        Arrays.sort(arr, com);

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i][0] + " ");
        }
    }
}
