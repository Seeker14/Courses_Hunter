package Lesson8.nonaccess;

public class Car {

    String color = "blue";
    String engine = "V6";
}

class Human{

    String name = "Ivan";
    final Car c = new Car();

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.c.engine = "V8";     // данным способом можно менять значение переменной
    }
}