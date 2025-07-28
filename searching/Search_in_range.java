package searching;

public class Search_in_range {
    public static int search(int[] arr, int target, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 2, 7, 9, 10, 33, 11 };
        int target = 9;
        System.out.println(search(arr, target, 1, 7));
    }
}
