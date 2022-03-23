package Lesson5.constructor;

public class Car2 {
    String color;
    String engine;
    int speed;

    int gaz(int skorost){
        speed +=skorost;
        return speed;
    }

    int tormoz(int skorost){
        speed -=skorost;
        return speed;
    }

    // хотим создать метод, который будет просто выводить информацию
    // если не хотим возвращать output, то используем void (пустота)
    // то есть наш метод ничего не возвращает
    // вывод на экран - это не есть output
    // output - это когда вы что-то имеете на экран после того, как метод выполнил обработку
    void showInfo(){
        System.out.println("cvet: " + color + " motor: " + engine + " skorost: " + speed);
    }
}

class Car2Test{
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color = "white";
        c1.engine = "V6";
        c1.speed = 60;

        c1.showInfo();
        c1.gaz(20);
        c1.showInfo();
        c1.tormoz(80);
        c1.showInfo();
    }
}
