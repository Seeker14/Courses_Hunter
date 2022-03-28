package Lesson8.nonaccess;

import org.w3c.dom.ls.LSOutput;

public class Student {

    String name;
    int course;
    static int count;  // принадлежит всему классу, является собсенностью класса,
                       // выделяется место в памяти? не сязанное с объектом, а связанное с самим классом

    public Student(String name2, int course2){
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # " + count + " sozdan");
    }

    public static void showCount(){
        System.out.println("Vsego sozdano studentov " + count);
    }
}

class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1);
        Student st2 = new Student("Petr", 4);
        Student st3 = new Student("Masha", 2);

        System.out.println(Student.count);
        System.out.println(st1.count);  // можно так писать, но не есть хорошо, поскольку так вызываются
        System.out.println(st2.count);  // instance переменные, переменные объекта

        Student.showCount();
        st2.showCount();
    }
}