package oops;

public class Introduction2 {
    public static void main(String args[]) {
        Student one = new Student(5, "Deep", 72.6f);
        Student two = one;

        two.rno = 16;
        System.out.println(one.rno);
    }
}

class Student {
    int rno;
    String name;
    float marks;

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

}
