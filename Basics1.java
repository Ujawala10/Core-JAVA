class Student{
    String name;
    int rollno;

    Student(){
        System.out.println("Student Object created");

    }

    void display(){
        System.out.println("NAME " + name);
        System.out.println("Rollno " + rollno);
    }


}


public class Basics1 {
    public static void main(String[] args){
        Student s = new Student();
        s.display();

    }
    
}
