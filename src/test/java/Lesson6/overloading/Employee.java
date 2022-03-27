package Lesson6.overloading;

public class Employee {

    Employee(int id2, String surname2, int age2){
        this(surname2, age2);   // внутри конструктора overloaded конструктор по имени класса
        id = id2;               // используется 'this'
    }

    Employee(String surname3, int age3){
        surname = surname3;
        age = age3;
    }

    Employee(int id4, String surname4, int age4, double salary4, String department4){
        this(id4, surname4, age4);     // должен всегда быть первым statement-ом, иначе будет ошибка компилятора
        salary = salary4;
        department = department4;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;

    /*
    можно переписать конструкторы по-другому
    Employee(int id2, String surname2, int age2){
        this(id2, surname2, age2, 0.0, null);
    }

    Employee(String surname3, int age3){
        this(0, surname3, age3, 0.0, null);
    }

    Employee(int id4, String surname4, int age4, double salary4, String department4){
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }
     */

    // CONSTRUCTOR OVERLOADING
    // 1. Перегруженные конструкторы имеют разный список параметров.
       // 1.1. Разный по типам данных:
          // Constructor (int a, String b) {}
          // Constructor (double a, boolean b) {}
       // 1.2. Разный по количеству:
          // Constructor (int a, int b) {}
          // Constructor (int a, int b, int c) {}
       // 1.3. Разный по порядку:
          // Constructor (int a, String b) {}
          // Constructor (String a, int b) {}
    // ПРАВИЛА OVERLOADING
    // 1. Access modifier может быть одинаковый и различный:
       // public Constructor(int a, int b) {}
       // private Constructor (int a, int b, int c) {}

       // public Constructor(int a, int b) {}
       // public Constructor (long a) {return 5;}
    // 2. Конструкторы, отличающиеся только access modifier не являются overloaded:
       // public Constructor (int a, String b) {}
       // private Constructor (int a, String b) {}
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivanov", 25);
        System.out.println(emp1.surname);
        Employee emp2 = new Employee("Petrov", 30);
        System.out.println(emp2.surname);
        Employee emp3 = new Employee(2, "Sidorov", 40, 100.35, "IT");
        System.out.println(emp3.department);
    }
}
