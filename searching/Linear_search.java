package searching;

public class Linear_search {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch2(int[] arr, int key) {
        for (int element : arr) {
            if (element == key) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 6, 8, 9 };
        System.out.println(linearSearch(arr, 6)); // 2
        System.out.println(linearSearch2(arr, 6)); // 2

    }
}
