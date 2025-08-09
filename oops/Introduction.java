package oops;

// import java.util.Arrays;

public class Introduction {
    public static void main(String args[]) {
        // store 5 roll nos
        // int[] numbers = new int[5];

        // // store 5 names
        // String[] names = new String[5];

        // // data of 5 students: {roll no, name, marks}
        // int[] rno = new int[5];
        // String[] name = new String[5];
        // float[] marks = new float[5];

        // Student[] students = new Student[5];

        // Student kunal;
        // kunal = new Student();

        // Student kunal = new Student(13, "Kunal Kushwaha", 85.4f);
        // // kunal.rno = 12;
        // // kunal.name = "Kunal Kushwaha";
        // // kunal.marks = 88.66f;
        // System.out.println(kunal.marks);

        // kunal.greeting();
        // kunal.changeName("Rahul");

        // System.out.println(kunal.rno);
        // System.out.println(kunal.name);
        // System.out.println(kunal.marks);

        // Student rahul = new Student(kunal);
        // System.out.println(rahul.rno);
        // System.out.println(rahul.name);
        // System.out.println(rahul.marks);

        Student random = new Student();
        System.out.println(random.name);

    }

}
// create a class
// for every single student

class Student {
    int rno;
    String name;
    float marks = 90;

    // we need a way to add the values
    // of the above properties object by object

    // we need one word to access every object

    void greeting() {
        System.out.println("Hello my name is " + this.name);
    }

    void changeName(String newName) {
        name = newName;
        System.out.println("hello my name is: " + name);
    }

    // Student() {
    // this.rno = 12;
    // this.name = "Kunal Kushwaha";
    // this.marks = 88.66f;

    // }

    Student(int roll, String name, float marks) {
        this.rno = roll;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other) {
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    Student() {
        // this is how you call a constructor from another constructor
        // internally it's something like:
        // new Student(13, "default person", 100.0f);
        this(13, "default person", 100.0f);

    }
}
