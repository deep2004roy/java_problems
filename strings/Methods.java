package strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Kunal Kushwaha";
        System.out.println(name.toCharArray());
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase()); // creates new object (immutable)
        System.out.println(name);
        System.out.println("               Kunal           ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
