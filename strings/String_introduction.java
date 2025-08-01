package strings;

import java.util.ArrayList;

public class String_introduction {
    public static void main(String[] args) {
        // String a = "Kunal";
        // System.out.println(a);
        // a = "Kushwaha"; // Here I am not changing the object I am creating a new
        // object
        // System.out.println(a);

        // String a = "Kunal";
        // String b = "Kunal";
        // System.out.println(a == b);

        // String name1 = new String("Kunal");
        // String name2 = new String("Kunal");
        // System.out.println(name1 == name2);
        // System.out.println(name1.equals(name2));
        // System.out.println(name1.charAt(0));

        // Integer num = new Integer(56);
        // System.out.println(num.toString());

        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char) ('a' + 3));
        System.out.println("a" + 1); // integer will be converted to Integer which will call .toString()
        // this is same as after a few steps "a" + "1"

        System.out.println("Kunal" + new ArrayList<>());
        // System.out.println("Kunal" + new Integer(56));
        // System.out.println(new ArrayList<>() + new Integer(56)); // error
        // + operator will work only for premitives (arithmatic expression)
        // or at least one of the objects to be added should be string (concatenation)
        // System.out.println(new ArrayList<>() + "" + new Integer(56)); // error
        System.out.println();

    }
}
