import java.util.Arrays;

public class swap {

    public static void swap1(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 23, 9, 18 };
        System.out.println(Arrays.toString(arr));
        swap1(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }
}
