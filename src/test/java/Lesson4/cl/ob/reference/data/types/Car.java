package Lesson4.cl.ob.reference.data.types;

public class Car {

    Car(){} // default конструктор, если его не написать он будет таким (прописано в Java)
    String color = "red";
    String engine = "V6";

}

class CarTest{
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = car1;
        System.out.println(car2.engine);

        car1.color = "black";
        car1.engine = "V8";

        System.out.println("Cvet: ");
        System.out.println(car1.color);
        System.out.println("Motor: ");
        System.out.println(car1.engine);

        // можно воспользоваться операцией конкатенации concatenation operations
        System.out.println("Cvet: " + car1.color);
        System.out.println("Motor: " + car1.engine);

        // можно использовать переменные, не создавая объекты
        int a;
        Car car3;

        // можно обращаться к объекту, не задавая для него переменную.
        // в данном случае мы сможем обратиться только один раз, повторно к этому же объекту обратиться не сможем
        System.out.println(new Car().color);

    }
}
