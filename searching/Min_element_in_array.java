package searching;

public class Min_element_in_array {
    public static int min(int[] arr) {
        int minElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minElement) {
                minElement = arr[i];
            }
        }
        return minElement;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, -6, 22, 25, 33, 44 };
        System.out.println(min(arr));
    }
}
