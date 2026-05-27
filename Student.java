class StudentData {

    String name;
    int rollno;
    float marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Marks: " + marks);
    }

    void result() {

        if (marks < 40) {
            System.out.println("Student is Failed");
        } 
        else {
            System.out.println("Congrats Passed");
        }
    }
}

public class Student {

    public static void main(String[] args) {

        StudentData s1 = new StudentData();
        StudentData s2 = new StudentData();

        s1.name = "Rahul";
        s1.rollno = 1;
        s1.marks = 55;

        s2.name = "Ujawala";
        s2.rollno = 2;
        s2.marks = 98;

        s1.display();
        s1.result();

        System.out.println();

        s2.display();
        s2.result();
    }
}