package Lesson4.cl.ob.reference.data.types;

import org.w3c.dom.ls.LSOutput;

public class BankAccount {

    int id;
    String name;
    double balance;

    // данные переменные называютя instance variable
    // означает, что относятся к каждому созданному объекту
    // если для переменных сразу присвоить значения, то они и будут выводить по умолчанию, если не будут заданы новые
/*
    public static void main(String[] args) {
        //создаём объект BankAccount внутри метода main

        BankAccount bA = new BankAccount();
        // BankAccount = тип данных переменной
        // bA = имя переменной
        // new BankAccount() = значение переменной, в данном случае это вызов конструктора, создание объекта
        // за new всегда следуюет вызов конструктора
        // new означает, что сейчас будет создаваться новый объект
        // new BankAccount() = то есть сейчас будет создавться объект класса BankAccount
        // new BankAccount() создает в области памяти какой-то объект
        // что такое BankAccount? Любой класс является типом данных
        // примитивных типов данных всего 8, а референсных бесконечное множество (поскольку вы можете создать их бесконечное множество)

        // создаём 3 новых объекта
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Elena";
        MyAccount.balance = 12.35;
        System.out.println(MyAccount.name);
        //System.out.println(HisAccount.balance); // поскольку не задали значение, то выводится дефолтное '0.0'
        //System.out.println(HisAccount.name);    // поскольку не задали значение, то выводится null

        // Дефолтные значения для примитивных типов данных
        //1. Численные (numeric):
           //1.1. Целые числа (integers):
              // byte     0
              // short    0
              // int      0
              // long     0
           //1.2. Дробные числа (floating-point):
              // float    0.0
              // double   0.0
        //2. Симольный (character):
              // char     '\u0000' или 0
        //3. Логический (logical):
              // boolean  false

        // Дефолтные значения для ссылочных типов данных
        //String        null
        //BankAccount   null
        //Car           null
        // ...          null
        // для ЛЮБОГО ссылочного типа данных дефолтное значение null

        YourAccount.id = 2;
        YourAccount.name = "Mike";
        YourAccount.balance = 2.00;

        HisAccount.id = 3;
        HisAccount.name = "Ivan";
        HisAccount.balance = 124.12;

    } */
    double popolnenieScheta(double popolnenie){
        System.out.println("Баланс до пополнения: " + balance);
        System.out.println("Баланс пополняется на: " + popolnenie);
        balance += popolnenie;
        System.out.println("Баланс после пополнения: " + balance);
        System.out.println();
        return balance;
    }

    double snyatieSoScheta(double snyatie){
        System.out.println("Баланс до уменьшения: " + balance);
        System.out.println("Баланс уменьшается на: " + snyatie);
        balance -= snyatie;
        System.out.println("Баланс после уменьшения: " + balance);
        System.out.println();
        return balance;
    }
}

 class BankAccountTest {
    public static void main(UseString[] args) {

        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.popolnenieScheta(30.5);
        MyAccount.snyatieSoScheta(20.5);
        MyAccount.id = 1;
        //MyAccount.name = "Elena";
        MyAccount.balance = 12.35;

        YourAccount.id = 2;
        YourAccount.name = "Mike";
        YourAccount.balance = 2.00;

        HisAccount.id = 3;
        HisAccount.name = "Ivan";
        HisAccount.balance = 124.12;

        System.out.println(MyAccount.name);

        // ПРИСВОЕНИЕ ЗНАЧЕНИЯ ДРУГОЙ ПЕРЕМЕННОЙ
        int d = 10;
        int f = d;  // для 'f' присвоили значение переменной 'd'

        // аналогично и с объектами
        BankAccount nM = new BankAccount();
        nM.name = "Pavel";
        BankAccount nM2 = nM;

        System.out.println(nM2.name);

    }
}
