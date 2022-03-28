package Lesson8.nonaccess;

public class Student2 {

    String name;
    int course;
    static int count;
    int a;

    public Student2(String name2, int course2){
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # " + count + " sozdan");
    }

    public static void showCount(){
        System.out.println("Vsego sozdano studentov " + count);
    }

    public void showInfo(){
        System.out.println("Welcome ti the Student class!!!");
    }

    void abc(){
        a++;
        count++;
    }

    static void abcd(){
        count++;
        Student2 st2 = new Student2("Petr", 2);
        st2.a++;
    }

    public static void main(String[] args) {
        // метод main является статичным, поскольку является первым для запуска, поэтому не нужно
        // создавать перед ним объекты. Если бы был статичным, то перед требовалось бы создать объекты

        abcd();
        Student2 st3 = new Student2("Ivan", 4);
        st3.abc();

    }
}

