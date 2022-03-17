package Lesson3.operators;

public class ProcessingSequence {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        int c1 = ++a - b * 2;   // ++a выполняется в первую очередь, затем идёт операция умножения: 11 - 6 = 5
        int c2 = (++a - b) * 2; // если необходимо сначала выполнить другие действия - заключаем их в скобки
        int c3 = (a-- - b) * 2; // сначала выполняются вычисления и только после этого от 'a' отнимается единица

        System.out.println(c3);
        System.out.println(a);

        // для char можем производить любые арифметические действия: '/', '*', '+', '-', '%'
        char c = 'a';  // каждому символу в Unicode соответствует порядковый номер, для 'a' = 97
        int i = 10;
        int i2 = c;  // означает, что 'i2' не будет равен 'a', а примет значение '97'
        System.out.println(i + c); // 10 + 97 = 107
        System.out.println(i % c); // остаток будет равен 10, поскольку i < c

        boolean b1 = false;
        boolean b2 = b1 == true;
        boolean b3 = b1 = true;
        System.out.println(b2);  // результат false
        System.out.println(b3);  // результат true
    }
}
