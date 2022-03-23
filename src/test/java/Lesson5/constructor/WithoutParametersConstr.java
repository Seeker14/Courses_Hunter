package Lesson5.constructor;

public class WithoutParametersConstr {
    //конструктор без параметров
    WithoutParametersConstr (){
        System.out.println("Object is created!!!");
        color = "blue";
        engine = "V12";
    }
    String color;
    String engine;
}
class WithoutTest{
    public static void main(String[] args) {
        WithoutParametersConstr car1 = new WithoutParametersConstr();
        System.out.println(car1.color);
        System.out.println(car1.engine);

        WithoutParametersConstr car2 = new WithoutParametersConstr();
        car2.color = "red";
        System.out.println(car2.color);
        System.out.println(car2.engine);
    }
}
