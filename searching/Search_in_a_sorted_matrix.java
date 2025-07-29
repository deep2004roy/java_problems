package searching;

import java.util.Arrays;

public class Search_in_a_sorted_matrix {
    public static int[] binarySearch(int[][] arr, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (target == arr[row][mid]) {
                return new int[] { row, mid };
            }
            if (target > arr[row][mid]) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }

        }
        return new int[] { -1, -1 };
    }

    public static int[] search(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;
        if (rows == 1) {
            return binarySearch(arr, 0, 0, cols - 1, target);
        }
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        // run the loop till 2 rows are reamaining
        while (rStart < rEnd - 1) { // this is true it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (arr[mid][cMid] == target) {
                return new int[] { mid, cMid };
            }
            if (arr[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (arr[rStart][cMid] == target) {
            return new int[] { rStart, cMid };
        }

        if (arr[rStart + 1][cMid] == target) {
            return new int[] { rStart + 1, cMid };
        }

        // search in 1st half
        if (target <= arr[rStart][cMid - 1]) {
            return binarySearch(arr, rStart, 0, cMid - 1, target);
        }
        // search in 2nd half
        if (target >= arr[rStart][cMid + 1]) {
            return binarySearch(arr, rStart, cMid + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= arr[rStart + 1][cMid - 1]) {
            return binarySearch(arr, rStart + 1, 0, cMid - 1, target);
        }
        // search in 4th half
        if (target >= arr[rStart + 1][cMid + 1]) {
            return binarySearch(arr, rStart + 1, cMid + 1, cols - 1, target);
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int target = 3;
        System.out.println(Arrays.toString(search(arr, target)));
    }

}
