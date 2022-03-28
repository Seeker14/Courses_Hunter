package Lesson7.modifiers;

public class Empoyee {

    public double salary;

    public void dvoynayaZP(){
        double result = salary * 2;  // данная переменная принадлежит метода, поэтому не имеет
                                     // access modifier, это локальные переменные
        System.out.println("Новая зп = " + salary * 2);
    }

    public Empoyee(double salary2){
        salary = salary2;
    }

    public static void main(String[] args) {
        Empoyee emp = new Empoyee(500);
        System.out.println(emp.salary);
        emp.dvoynayaZP();
    }
}

class EmpoyeeTest{
    public static void main(String[] args) {
        Empoyee emp = new Empoyee(500);
        System.out.println(emp.salary);
        emp.dvoynayaZP();
    }
}
