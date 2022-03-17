package Homework;

public class Lesson2 {

    public static void main (String[] args){

        // 1.1. Все 4 переменные типа byte должны равняться 12 и быть записаны в разных системах счисления
        byte b1 = 0b1100; // 2-ичная система счисления
        byte b2 = 014;    // 8-ричная система счисления
        byte b3 = 12;     // 10-ричная система счисления
        byte b4 = 0xC;    // 16-ричная система счисления

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        // 1.2. Все 4 переменные типа short должны равняться 1300 и быть записаны в разных системах счисления
        short s1 = 0b10100010100; // 2-ичная система счисления
        short s2 = 02424;    // 8-ричная система счисления
        short s3 = 1300;     // 10-ричная система счисления
        short s4 = 0x514;    // 16-ричная система счисления

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        // 1.3. Все 4 переменные типа int должны равняться 0 и быть записаны в разных системах счисления
        int i1 = 0b0; // 2-ичная система счисления
        int i2 = 00;    // 8-ричная система счисления
        int i3 = 0;     // 10-ричная система счисления
        int i4 = 0x0;    // 16-ричная система счисления

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        // 1.4. Все 4 переменные типа long должны равняться 123456789 и быть записаны в разных системах счисления
        long l1 = 0b111010110111100110100010101L; // 2-ичная система счисления
        long l2 = 0726746425L;    // 8-ричная система счисления
        long l3 = 123456789L;     // 10-ричная система счисления
        long l4 = 0x75BCD15L;    // 16-ричная система счисления

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

        // 2.0. Создать по 2 переменные типов данных float, double, boolean
        float f1 = 3.14F;
        float f2 = -19f;

        double d1 = 6.456798D;
        double d2 = -4.3245;

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(bo1);
        System.out.println(bo2);

        // 3.0. Создать n-ное кол-во переменных типа данных char всеми возможными способами
        char c1 = 'l';
        char c2 = 45987;
        char c3 = '\u0079';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
