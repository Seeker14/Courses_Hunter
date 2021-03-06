package Lesson3.operators;

public class Assignment {
    public static void main(String[] args) {

        // 2.1. ПРИСВАИВАНИЕ '='
        int a = 3;
        int b = 50;
        int f = 0;
        a = b = f = 18;   // оператор присвоения всегда начинает работать СПРАВА: сначала 'c' становится равной 18,
                          // затем 'b' становится равной 18, затем 'a' становится равной 18
        System.out.println(a);
        System.out.println(b);
        System.out.println(f);

        long g = 100L;
        int h = 10;
        g = h;   // можем присвоить, поскольку любое значение типа int входит в область значений для long
                 // НО h = g НЕЛЬЗЯ, поскольку не любое значение типа long входит в область значений для int
        System.out.println(g);
        short j = 12;
        g = j;   // можем присвоить, поскольку любое значение типа short входит в область значений для long
        h = j;   // можем присвоить, поскольку любое значение типа short входит в область значений для int
        float k1 = 3.14F;
        double l1 = 1.23;
        // во float и double влезают любые целые числа, в том числе относящиеся к типу long
        float k2 = g;
        double l2 = g;

        // 2.2. ПРИБАВЛЕНИЕ + ПРИСВАИВАНИЕ '+='
        int c = 5;
        c = c + 3;  // выражение означает: сначала прибавь 3, а потом присвой значение для 'c'
        c += 3;     // выражение означает то же самое, что и выше
        System.out.println(c);

        // 2.3. ВЫЧИТАНИЕ + ПРИСВАИВАНИЕ '-='
        int d = 7;
        d = d - 2;  // выражение означает: сначала вычти 2, а потом присвой значение для 'd'
        d -= 2;     // выражение означает то же самое, что и выше
        System.out.println(d);

        // 2.4. ДЕЛЕНИЕ + ПРИСВАИВАНИЕ '/='
        int e = 9;
        e = e / 2;  // выражение означает: сначала раздели на 2, а потом присвой значение для 'e'
        e /=2;      // выражение означает то же самое, что и выше
        System.out.println(e);

        // 2.5. УМНОЖЕНИЕ + ПРИСВАИВАНИЕ '*='
        int i = 11;
        i = i * 2;  // выражение означает: сначала умножь на 2, а потом присвой значение для 'i'
        i *=2;      // выражение означает то же самое, что и выше
        System.out.println(i);

    }
}
