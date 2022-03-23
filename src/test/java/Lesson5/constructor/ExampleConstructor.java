package Lesson5.constructor;

public class ExampleConstructor {

    ExampleConstructor(String cvet, String motor){
        color = cvet;
        engine = motor;
        System.out.println("Цвет машины: " + color + " мотор машины: " + engine);
    }
    String color;
    String engine;
}
class ExampleTest{
    public static void main(String[] args) {
        ExampleConstructor car1 = new ExampleConstructor("black", "V8");
        ExampleConstructor car2 = new ExampleConstructor("white", "V6");

    }
}
