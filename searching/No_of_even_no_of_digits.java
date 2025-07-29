package searching;

public class No_of_even_no_of_digits {
    public static int noOfDigits(int num) {
        // int count = 0;
        // while (num != 0) {
        // count++;
        // num = num / 10;
        // }
        // return count;
        return (int) (Math.log10(num)) + 1;
    }

    public static int findNumbers(int[] nums) {
        int countEven = 0;
        for (int i = 0; i < nums.length; i++) {
            if (noOfDigits(nums[i]) % 2 == 0) {
                countEven++;
            }
        }
        return countEven;

    }

    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));
    }
}
