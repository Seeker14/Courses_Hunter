package Lesson3.operators;

public class Arithmetics {
    public static void main(String[] args) {

        // 1.1. СЛОЖЕНИЕ '+'
        // 1 вариант:
        int a = 5;
        int b = 10;
        System.out.println(a + b);

        // 2 вариант:
        int c = 3;
        int d = 2;
        int e = c + d;
        System.out.println(e);

        // 1.2. ВЫЧИТАНИЕ '-'
        // 1 вариант:
        int f = 5;
        int g = 10;
        System.out.println(g - f);

        // 2 вариант:
        int h = 2;
        int i = 8;
        int j = i - h;
        System.out.println(j);

        // 1.3. УМНОЖЕНИЕ '*'
        // 1 вариант:
        int k = 5;
        int l = 10;
        System.out.println(k * l);

        // 2 вариант:
        int m = 2;
        int n = 8;
        int o = n * m;
        System.out.println(o);

        // 1.4. ДЕЛЕНИЕ '/'
        // 1 вариант:
        int p = 10;
        int q = 3;
        System.out.println(p / q); // при использовании типа данных int вся дробная часть отсекается, и результат равен 3

        double r = 11;
        double s = 3;
        System.out.println(r / s); // при использовании типа данных double дробная часть выводится

        // 2 вариант:
        int t = 2;
        int u = 8;
        int v = u / t;
        System.out.println(v);

        // 1.5. ОСТАТОК ОТ ДЕЛЕНИЯ '%'
        int w = 4;
        int x = 9;
        int celayaChast = x / w; // 4 два раза вместилось в 9
        int ostatok = x % w;     // и остался остаток 1
        System.out.println(celayaChast);
        System.out.println(ostatok);

        double y = 5.5;
        double z = 3.5;
        double ostatokDouble = y % z;
        System.out.println(ostatokDouble);

        // 1.6. UNARY-операция увеличения на единицу '++'
        int aa = 5;
        int bb = 3;
        int cc = aa - bb++; // сначала из 'aa' вычитается 'bb', а потом к 'bb' прибавляется единица
        System.out.println(cc); // результат 2
        System.out.println(bb); // результат 4

        int dd = 5;
        int ee = 3;
        int ff = dd - ++ee; // сначала к 'ee' прибавляется единица, потом из 'dd' вычитается новое значение 'ee'
        System.out.println(ff); // результат 1
        System.out.println(ee); // результат 4

        bb++; // можно использовать отдельно так, чтобы просто прибавить единицу к значению
        ++bb; // результат будет аналогичен и с верхним, поскольку операция используется не в выражении, а отдельно

        // 1.7. UNARY-операция уменьшения на единицу '--'
        int gg = 10;
        int hh = 5;
        int ii = gg-- - hh; // сначала из 'gg' вычитается 'hh', а потом от 'gg' отняли единицу
        System.out.println(ii); // результат 5
        System.out.println(gg); // результат 9

        int jj = 10;
        int kk = 5;
        int ll = --jj - kk; // сначала от 'jj' отняли единицу, потом из нового значения 'jj' вычли 'kk'
        System.out.println(ll); // результат 4
        System.out.println(jj); // результат 9

        int mm = 5;
        int nn = ++a - --a - a-- + a++;
        // '++a' увеличили на 1 = 6
        // '--a' новое значение 'a' уменьшаем на 1 = 5 и вычитаем из '++a'
        // 'a--' новое значение 'a' уменьшаем на 1 = 4, но вычитаем прежнее значение, поскольку postfix '--'
        // 'a++' новое значение 'a' увеличиваем на 1 = 5, но прибавляем прежнее значение, поскольку postfix '++'
        // Получаем: 6 - 5 - 5 +4 = 0
        System.out.println(nn);
    }
}
