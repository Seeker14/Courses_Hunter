package Homework;

public class Student {

    int ticket;
    String name;
    String surname;
    int yearStudy;
    double averagePointMathematics;
    double averagePointEconomy;
    double averagePointForeignLanguage;
}

class StudentTest{

    double averageArifm(Student st){
        double av = (st.averagePointMathematics + st.averagePointEconomy +st.averagePointForeignLanguage)/3;
        System.out.println("Средняя арифметическая оценка студента " + st.name + st.surname + ": " + av);
        return av;
    }

    public static void main(String[] args) {

        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();

        st1.ticket = 5433;
        st1.name = "Masha";
        st1.surname = "Popova";
        st1.yearStudy = 2022;
        st1.averagePointMathematics = 5.4;
        st1.averagePointEconomy = 3.0;
        st1.averagePointForeignLanguage = 4.3;

        st2.ticket = 138;
        st2.name = "Pavel";
        st2.surname = "Fokin";
        st2.yearStudy = 2021;
        st2.averagePointMathematics = 5.0;
        st2.averagePointEconomy = 2.5;
        st2.averagePointForeignLanguage = 3.0;

        st3.ticket = 1546;
        st3.name = "Roman";
        st3.surname = "Gusev";
        st3.yearStudy = 2020;
        st3.averagePointMathematics = 4.3;
        st3.averagePointEconomy = 4.0;
        st3.averagePointForeignLanguage = 4.2;

        StudentTest sTest = new StudentTest();
        sTest.averageArifm(st1);
        sTest.averageArifm(st2);
        sTest.averageArifm(st3);
    }
}
