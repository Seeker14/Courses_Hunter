package Homework;

public class Lesson8 {

    public final static double p = 3.14;

    static int umn(int a, int b, int c){
        return a * b * c;
    }

    static void del(int d, int e){
        System.out.println("Выводим целое частное: " + d / e);
        System.out.println("Выводим остаток: " + d % e);
    }

    public double s(double r1){
        double result = p * r1 * r1;
        return result;
    }

    public static double o(double r2){
        double result1 = 2 * p * r2;
        return result1;
    }

    public void info(double r3){
        System.out.println("Радиус: " + r3);
        System.out.println("Площадь круга: " + s(r3));
        System.out.println("Окружность: " + o(r3));
    }
}

class Lesson8Test{
    public static void main(String[] args) {

        System.out.println(Lesson8.umn(4,6,7));
        System.out.println(Lesson8.umn(1,2,4));

        Lesson8.del(9,2);
        Lesson8.del(4,3);

        Lesson8 l = new Lesson8();
        l.s(5);
        Lesson8.o(4);
        l.info(5);
    }

}
