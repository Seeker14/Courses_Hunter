package Lesson3.operators;

public class Logical {
    public static void main(String[] args) {

        boolean x = true;
        boolean y = true;
        boolean z = true;
        boolean m = false;
        boolean n = false;
        boolean l = false;

        // 4.1. AND '&&'
        // возвращает true только тогда, когда удовлетворяются все критерии: все критерии = true
        boolean result1 = x && y && z && m;
        boolean result2 = x && y && z;
        System.out.println(result1);
        System.out.println(result2);

        // 4.2. OR '||'
        // возвращает true только тогда, когда удовлетворяется один из критериев: один из критериев = true
        boolean result3 = x || y || z || m;
        boolean result4 = m || n || l;
        System.out.println(result3);
        System.out.println(result4);

        // SHORT CIRCUIT присущ только '&&' и '||'
        // Это свойство укорачивания вычисления выражения, если результат может быть дедуцирован из части выражения
        boolean a = true;
        boolean b = false;
        boolean c1 = b && a; // сначала читается операнд 'b', и поскольку он 'false', то результат выражения уже
                             // точно будет 'false', поэтому операнд 'a' даже не читается
        boolean c2 = a && b; // но в данном случае читаются все операнды
        boolean d1 = a || b; // сначала читается операнд 'a', и поскольку он 'true', то результат выражения уже
                             // точно будет 'true', поэтому операнд 'b' даже не читается
        boolean d2 = a || b; // но в данном случае читаются все операнды

        int i = 10;
        int j = 50;
        int k = 0;
        int r = 99;
        int o = 100;
        boolean p1 = i < j && k == o;   // true && false = false
        boolean p2 = i < j && k++ == o; // сначала 'k' будет сравниваться с 'o' и только потом увеличится на единицу
        boolean p3 = i < j && ++r == o; // true && true = true
        boolean p4 = i > j && ++r == o; // первое выражение = false, второе выражение не читается
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        boolean p5 = i > j || ++r ==o; // false || true = true
        boolean p6 = i < j || ++r ==o; // первое выражение = true, второе выражение не читается
        System.out.println(p5);
        System.out.println(p6);

        // 4.3. ОТРИЦАНИЕ '!'
        b = !a;   // поскольку 'a' равен true, то 'b' будет равен false (принимает противоположное значение)
                  // !true = false, !false = true
        System.out.println(b);
        System.out.println(!a);
        System.out.println(!b);

        int e = 10;
        int f = 50;
        boolean g = e > f;
        boolean h = !(e > f); // если хотим передать противоположное значение, то выражение выносим в '()'
                              // и ставим '!' перед ним
        System.out.println(g);
        System.out.println(h);

        // 4.4. BETWISE AND '&'
        // выполняются все операнды вне зависимости от того, повлияет ли это на дальнейший результат
        boolean p7 = i > j && ++r == o; // в данном случае не будет читаться второе выражение, поскольку
                                        // результат первого = false
        boolean p8 = i > j & ++r == o;  // теперь второе выражение будет читаться и 'r' увеличится на единицу
        System.out.println(r);

        int q = 10;
        int s = 5;
        System.out.println(q & s); // если бы использовали '&&', то вернулась бы ошибка компиляции
        // для 'q & s' выполняются побитовые операции
        // 10 в 2-ичной сис-ме = 1010
        // 5 в 2-ичной сис-ме = 0101
        // 1010
        // 0101
        // 0000   '0' и '1' при сложении и применении '&' даёт '0'
        //        '1' и '0' при сложении и применении '&' даёт '0'
        // 0000 - это число '0' в 2-ичной системе

        // 4.5. BETWISE OR '|'
        // выполняются все операнды вне зависимости от того, повлияет ли это на дальнейший результат
        boolean p9 = i < j || ++r == o;  // в данном случае не будет читаться второе выражение, поскольку
                                         // результат первого = true
        boolean p10 = i < j | ++r == o;  // теперь второе выражение будет читаться и 'r' увеличится на единицу
        System.out.println(r);
        System.out.println(q | s); // если бы использовали '||', то вернулась бы ошибка компиляции
        // для 'q | s' выполняются побитовые операции
        // 10 в 2-ичной сис-ме = 1010
        // 5 в 2-ичной сис-ме = 0101
        // 1010
        // 0101
        // 1111   '0' и '1' при сложении и применении '|' даёт '0'
        //        '1' и '0' при сложении и применении '|' даёт '0'
        // 1111 - это число '15' в 2-ичной системе

        // 4.6. BETWISE EXCLUSIVE OR '^'
        // возвращает true тогда и ТОЛЬКО тогда, когда ТОЛЬКО одна операнда всего выражения true
        boolean b11 = true;
        boolean b12 = true;
        boolean b13 = true;
        boolean b14 = true;
        boolean b15 = false;
        boolean b16 = false;
        boolean b17 = false;

        System.out.println(b11 ^ b12 ^ b13 ^ b14); // результат false
        System.out.println(b15 ^ b16 ^ b17);       // результат false
        System.out.println(b11 ^ b15 ^ b16 ^ b12); // результат false
        System.out.println(b11 ^ b15 ^ b16 ^ b17); // результат true

    }
}
