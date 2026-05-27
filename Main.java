public class Main {

    public static void main(String[] args) {

        // Object using default constructor
        Employee emp1 = new Employee();

        emp1.display();

        System.out.println();

        // Object using parameterized constructor
        Employee emp2 = new Employee("Ujawala", 2, 50000);

        emp2.display();
    }
}

class Employee {

    String name;
    int id;
    int salary;

    // Default Constructor
    Employee() {

        name = "Unknown";
        id = 0;
        salary = 0;

        System.out.println("This is Default Constructor");
    }

    // Parameterized Constructor
    Employee(String name, int id, int salary) {

        this.name = name;
        this.id = id;
        this.salary = salary;

        System.out.println("This is Parameterized Constructor");
    }

    // Display Method
    void display() {

        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Salary : " + salary);
    }
}