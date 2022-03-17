package Lesson3.operators;

public class Relational {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;
        int c = 5;

        // 3.1. БОЛЬШЕ '>'
        boolean b1 = a > b;
        System.out.println(b1);
        System.out.println(a > b); // можно не определять переменную 'b1', а сразу указывать выражение

        // 3.2. БОЛЬШЕ ИЛИ РАВНО '>='
        boolean b2 = a >= b;
        System.out.println(b2);

        // 3.3. МЕНЬШЕ '<'
        boolean b3 = a < b;
        System.out.println(b3);

        // 3.4. МЕНЬШЕ ИЛИ РАВНО '<='
        boolean b4 = b <= c;
        boolean b5 = 5 <=5;  // можно использовать не только переменные, но и сами числа
        System.out.println(b4);
        System.out.println(b5);

        // 3.5. РАВНО '=='
        boolean b6 = a == b;
        boolean b7 = c == b;
        System.out.println(b6);
        System.out.println(b7);

        // 3.6. НЕ РАВНО '!='
        boolean b8 = c != a;
        boolean b9 = c != b;
        System.out.println(b8);
        System.out.println(b9);
    }
}
