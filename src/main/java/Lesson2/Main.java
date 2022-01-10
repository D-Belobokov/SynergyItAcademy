package Lesson2;
//Выполнить элементарные арифметические операции с целыми и вещественными числами
//Автоматизировать вычисление произвольной математической формулы

public class Main {
    public static void main(String[] args) {
        int a = 23;
        int b = 57;
        System.out.println("переменная a=" + a);
        System.out.println("переменная b=" + b);
        System.out.println("==========");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("переменная a=" + a);
        System.out.println("переменная b=" + b);
    }
}
