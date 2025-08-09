package oops;

public class WrapperExample {
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap2(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;

        Integer a = 10;
        Integer b = 20;

        // // converting a premitive into an object
        // // Integer num = new Integer(45);
        // Integer num2 = 45;

        // swap(a, b);

        // System.out.println(a + " " + b); // value of a and b will not changed

        swap2(a, b);
        // System.out.println(a + " " + b);
        // It is still not swapping
        // because Integer is final class

        // final int bonus = 2;
        // bonus = 3;
        // it is showing error as it can not be modified

        final Student kunal = new Student("Kunal");
        kunal.name = "Deep";

        // System.out.println(kunal.name);

        // kunal = new Student(null)
        // when a non pemitive is final you can not reassign it

        Student obj;

        for (int i = 0; i < 10; i++) {
            obj = new Student("random name");
        }

    }
}

class A {
    final int num = 10;
}

class Student {
    String name;

    Student(String name) {
        System.out.println("Object is created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
