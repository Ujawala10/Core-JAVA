class Student{
    String name;
    int rollno;

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);

    }
}




public class Basics{
    public static void main(String[] args){

        Student s = new Student();
        s.name = "Rahul";
        s.rollno = 101;

        s.display();

    }
}

