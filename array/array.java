
// import java.util.Arrays;
// import java.util.Scanner;

public class array {
    public static void main(String args[]) {
        // int arr[] = { 1, 2, 3 };
        // arr[0] = 99;
        // System.out.println(arr);
        // System.out.println(Arrays.toString(arr));

        // int[] rnos = new int[5];
        // System.out.println(rnos[1]);
        // System.out.println(rnos[2]);
        // System.out.println(rnos[3]);

        // String[] arr = new String[4];
        // System.out.println(arr[2]);

        // Array of premitives

        // int[] arr = new int[5];
        // arr[0] = 1;
        // arr[1] = 2;
        // arr[2] = 3;
        // arr[3] = 4;
        // arr[4] = 5;
        // // System.out.println(arr[4]);
        // Scanner sc = new Scanner(System.in);

        // input
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }

        // output
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // for (int i : arr) { // for every element in array, print the element
        // System.out.print(i + " ");
        // }

        // System.out.println(Arrays.toString(arr));
        // System.out.println();

        // Array of objects
        // String[] str = new String[5];
        // for (int i = 0; i < str.length; i++) {
        // str[i] = sc.next();
        // }
        // System.out.print(Arrays.toString(str));

        // int[] nums = { 1, 2, 3, 4 };
        // System.out.println(Arrays.toString(nums));
        // change(nums);
        // System.out.println(Arrays.toString(nums));

        // int[][] arr = new int[3][];
        // int[][] arr2 = { { 1, 2, 3 }, // 0th index
        // { 4, 5 }, // 1st index
        // { 6, 7, 8, 9 } }; // 2nd index

        // int[][] arr = new int[3][3];
        // // System.out.println(arr.length); // no of rows

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[0].length; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }
        // sc.close();

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[0].length; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(Arrays.toString(arr[i]));
        // }
        // for (int[] a : arr) {
        // System.out.println(Arrays.toString(a));
        // }

        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6 }, { 7, 8, 9 } };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // public static void change(int[] arr) {
    // arr[0] = 99;
    // }
}