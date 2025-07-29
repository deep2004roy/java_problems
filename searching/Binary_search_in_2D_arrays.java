package searching;

import java.util.Arrays;

public class Binary_search_in_2D_arrays {
    public static int[] search(int[][] arr, int target) {
        int row = 0;
        int col = arr[row].length - 1;
        while (row < arr.length) {
            while (col > 0) {
                if (target == arr[row][col]) {
                    return new int[] { row, col };
                }
                if (target > arr[row][col]) {
                    row++;
                } else {
                    col--;
                }

            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[][] arr = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 28, 29, 37, 49 }, { 33, 34, 38, 50 } };
        System.out.println(Arrays.toString(search(arr, 35)));
    }
}
