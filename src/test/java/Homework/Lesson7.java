package Homework;

public class Lesson7 {

    private double salary;
    public String surname;
    int id;

    public void pokaz1(){
        System.out.println("Показ " + salary);
    }

    public void pokaz2(){
        System.out.println("Показ " + surname);
    }

    public void pokaz3(){
        System.out.println("Показ " + id);
    }

    private Lesson7(double salary1){
        salary = salary1;
    }

    public Lesson7(String surname1){
        surname = surname1;
    }

    Lesson7(int id1) {
        id = id1;
    }
}

class Lesson7Test{
    public static void main(String[] args) {
        Lesson7 les1 = new Lesson7("Sidorov");
        les1.pokaz2();

        Lesson7 les2 = new Lesson7(8);
        les2.pokaz3();
    }
}
