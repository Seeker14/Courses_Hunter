package Homework.Lesson6;

public class Student {

    Student(int id1, String name1, String surname1, int course1, double averagePointMathematics1,
            double averagePointEconomy1, double averagePointForeignLanguage1){
        int id = id1;
        String name = name1;
        String surname = surname1;
        int course = course1;
        double averagePointMathematics = averagePointMathematics1;
        double averagePointEconomy = averagePointEconomy1;
        double averagePointForeignLanguage = averagePointForeignLanguage1;
    }

    Student(int id2, String name2, String surname2, int course2){
        this(id2, name2, surname2, course2, 0.0,
                0.0, 0.0);
    }

    Student(){

    }

    int id;
    String name;
    String surname;
    int course;
    double averagePointMathematics;
    double averagePointEconomy;
    double averagePointForeignLanguage;
}

class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student(5, "Ivan", "Sidorov",
                4, 5.4,
                4.3, 3.2);
        Student st2 = new Student(6, "Petr", "Kukushkin", 4);
        Student st3 = new Student();
    }
}
