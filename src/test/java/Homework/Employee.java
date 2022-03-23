package Homework;

public class Employee {
    Employee(int id2, String surname2, int age2, double salary2, String department2){
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }
    int id;
    String surname;
    int age;
    double salary;
    String department;

    double gross(){
        salary *= 2;
        return salary;
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee e1 = new Employee(4, "Mashkov", 32, 350.50, "Testing");
        Employee e2 = new Employee(7, "Mashkova", 34, 287.50, "Testing");

        e1.gross();
        System.out.println("Новая зарплата работника " + e1.surname + ": " + e1.salary);

        e2.gross();
        System.out.println("Новая зарплата работника " + e2.surname + ": " + e2.salary);
    }
}
