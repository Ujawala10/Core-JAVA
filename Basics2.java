class Student{
    String name;
    int rollno;

    Student(String name, int rollno){

        this.name = name;
        this.rollno = rollno;
        
    }

    void display(){
        System.out.println("Name " + name);
        System.out.println("Roll no " + rollno);
    }
}


public class Basics2 {
    public static void main(String[] args){
        Student s1 = new Student("Ujawala", 101);
        Student s2 = new Student("Taher", 102);

        s1.display();
        s2.display();


    }
    
}
