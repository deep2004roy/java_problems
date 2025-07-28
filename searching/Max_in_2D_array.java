package searching;

public class Max_in_2D_array {
    public static int max(int[][] arr) {
        int maxVal = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxVal) {
                    maxVal = arr[i][j];
                }
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        int[][] arr = { { 2, 24, 3, 66, 4, 33 }, { 8, 66, 34, 22 }, { 1, 5 }, { 33, 45, 23 } };
        System.out.println(max(arr));
    }
}
