package strings;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.6543f;
        System.out.printf("formatted nuber is %.2f", a); // rounds off as well
        System.out.println();
        System.out.println(Math.PI);
        System.out.printf("PI: %.3f", Math.PI);
        System.out.println();
        System.out.printf("Hi, my name is %s and I am %s", "Deep", "student");
    }
}
