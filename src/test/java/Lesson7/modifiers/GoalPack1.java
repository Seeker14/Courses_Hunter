package Lesson7.modifiers;

import Lesson6.overloading.Employee;

public class GoalPack1 {
    // ОСНОВНЫЕ ЦЕЛИ ПАКЕТА
    // 1. Защита доступа (access protection).
    // 2. Управление набором возможных имён (Namespace management).
       // внутри пакета не может быть классов с одинаковыми именами
    // 3. Хранение связанных классов в одном месте (Keeping related classes in one place).
    public static void main(String[] args) {
        GoalPack2 object = new GoalPack2();
        Employee object1 = new Employee("Ivanov", 21);
    }

    // КОНТРОЛЛЕР ДОСТУПА (ACCESS MODIFIER) для constructor, variable, method
    // 1. public
       // можно использовать в любом классе любого пакета
    // 2. private
       // будет виден только внутри ЭТОГО класса
    // 3. (default)
       // будет виден ТОЛЬКО внутри пакета
    // 4. protected
       // его видимость = default + он будет виден для классов, которые являются детьми того класса,
       // ребенком которого он является

    //ВНЕШНИЕ КЛАССЫ МОГУТ ИМЕТЬ ТОЛЬКО 2 ACCESS MODIFIER
    // 1. public     (будет виден во всех классах любого пакета)
    // 2. default    (будет виден только внутри данного пакета)

}
