package Lesson5.constructor;

public class ConceptConstructor {

    // КОНСТРУКТОР
    // BankAccount bA = new BankAccount();
    // первый BankAccount - это тип данных
    // второй BankAccount - это вызов конструктора
    // название конструктора всегда совпадает с названием класса

    // ТИПЫ КОНСТРУКТОРА
    // 1. Default (не имеет параметров, внутри тела пустота)
    // создаётся компилятором
    // всегда без параметров
    // тело всегда пустое
    // у любого класса в Java есть конструктор, даже если вы его не напишете
    // пример, Car(){}
    // 2. User defined (тот, который мы определили)
    // создаётся нами
    // может быть с параметрами или без
    // тело может быть пустым или нет
    // если мы создали конструктор, то default конструтор создавать по умолчанию уже не будет

    //ОТЛИЧИЯ МЕТОДА ОТ КОНСТРУКТОРА:
    // 1. МЕТОД
       // 1.1. всегда имеет return type, а если ничего не нужно возвращать в return используем void
       // 1.2. можем придумать бесчисленное количество имён
    // 2. КОНСТРУКТОР
       // 2.1. никогда не имеет return type
       // 2.2. имя должно совпадать с именем класса

    ConceptConstructor(String cvet, String motor){  // если перед ConceptConstructor написать void,
                                                    // то конструктор превращается в метод
        color = cvet;
        engine = motor;
    }

    String color;
    String engine;
}

class ConstuctorTest{
    public static void main(String[] args) {
        ConceptConstructor car1 = new ConceptConstructor("yellow", "V4");
        System.out.println(car1.color);
        System.out.println(car1.engine);
    }
}
