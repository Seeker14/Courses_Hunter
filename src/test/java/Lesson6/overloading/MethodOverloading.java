package Lesson6.overloading;

public class MethodOverloading {

    void show(int i1){          // было showInt
        System.out.println(i1);
        System.out.println("Data type is int");
    }

    void show(int a, int b){    // если бы был только 1 параметр, то компилятор бы ругался на 2
        System.out.println(a);  // одинаковых метода
        System.out.println("Data type is int");
    }

    void show(boolean b1){  // было showBoolean
        System.out.println(b1);
        System.out.println("Data type is boolean");
    }

    void show(String s1){    // было showString
        System.out.println(s1);
        System.out.println("Data type is String");
    }

    void show(String s, int a){
        System.out.println("String: " + s + " int: " + a);
    }

    void show(int a, String s){
        System.out.println("Какой хороший день!!!");
    }

    // OVERLOADING (перегрузка)
    // позволяет назвать данные методы одним именем
    // Характеристики overloading:
    // 1. Перегруженные методы имеют одинаковые имена и разный список параметров
       // 1.1. Разный по типам данных
         // void method (int a, String b) {}
         // void method (double a, boolean b) {}
       // 1.2. Разный по количеству:
         // void method (int a, int b) {}
         // void method (int a, int b, int c) {}
       // 1.3. Разный по порядку:
         // void method (int a, String b) {}
         // void method (String a, int b) {}
    // ПРАВИЛА, при которых методы считаются Overloading:
    // являются overloading, когда имеют одинаковое имя и разный список параметров
       // 1. Return type может быть одинаковый или различный:
          // void method (int a, String b) {}
          // void method (double a, boolean b) {}

          // void method (double a, boolean b) {}
          // int method (long a) {return 5;}
       // 2. Access modifier может быть одинаковый и различный:
          // public void method (int a, int b) {}
          // private void method (int a, int b, int c) {}

          // public void method (int a, int b) {}
          // public int method (long a) {return 5;}
       // 3. Методы, отличающиеся только return type или access modifier не являются overloaded:
          // public void method (int a, String b) {}
          // private void method (int a, String b) {}

          // public void method (int a, String b) {}
          // public String method (int a, String b) {return "a";}

}
class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 500;
        mO.show(a);
        boolean b = true;
        mO.show(b);
        String s = "Privet!!!";
        mO.show(s);
        mO.show("privet", 10);
        mO.show(10, "privet");
    }
}