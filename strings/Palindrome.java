package strings;

public class Palindrome {
    static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "a";
        System.out.println(isPalindrome(str));
    }
}
