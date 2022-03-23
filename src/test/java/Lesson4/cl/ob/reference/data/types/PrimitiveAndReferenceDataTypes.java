package Lesson4.cl.ob.reference.data.types;

public class PrimitiveAndReferenceDataTypes {
    public static void main(UseString[] args) {

        // разница между притивными и ссылочными типами данных
        int a; // переменная 'а' примитивного типа данных
        a = 10; // и если мы присвоим ей значение 10, то значение переменной 'a' равно 10

        // BankAccount bC; // переменная 'bC' ссылочного типа данных
                        // 'bC' содержит указатель ('F375'), который указывает на область памяти,
                        // в которой расположен объект
        BankAccount bC = new BankAccount();
        // new BankAccount() создает в области памяти какой-то объект
        // 'bC' не содержит в себе этот объект, она содержит адрес, по которому можно найти этот объект
        // из-за того, что 'bC' содержит адрес, а не сам объект, этот тип данных и называется ссылочным
    }
}
