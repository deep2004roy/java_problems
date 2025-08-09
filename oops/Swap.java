package oops;

public class Swap {
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println("Value of a is " + a);
        System.out.println("Value of b is " + b);
    }
}
