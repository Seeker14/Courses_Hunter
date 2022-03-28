package Lesson8.nonaccess;

public class NonAccess {

    // Non-access Modifiers
    // 1. final, может относиться к:
       // 1.1. variable (constant): делает из переменной константу, значение переменной не может меняться
          // read only
          // инициализируем переменную сразу или в каждом конструкторе
          // если является static, то определяем её значение при создании
       // 1.2. method
       // 1.3. class
    // 2. static
       // 2.1. variable: принадлежат всему классу в целом
       // 2.2. method: принадлежат всему классу в целом
       // чтобы вызвать переменную или метод больше не нужно создавать объект, но нужно ссылаться на класс
       // пример: System.out.println(Student.count);
       // но не является ошибочным использовать ее с каким-либо объектом
       // очень часто используется с final
       // не могут вызывать, обращаться к instance переменным и методам напрямую (можно создать объект внутри)
       // к static элементам принято обращаться, используя имя класса, а не ссылку на созданный объект
    // 3. abstract

    public final int a = 12;  // можно писать и final public, но лучше как написано

    public final int b;

    NonAccess(){
        b = 15;
    }

    NonAccess(boolean c){
        b = 10;
    }

    public void abc(short s){
        byte b = 10;
        System.out.println(s + b);
    }

    public static void main(String[] args) {
        NonAccess n = new NonAccess();
        System.out.println(n.a);
        System.out.println(n.b);
    }
}
