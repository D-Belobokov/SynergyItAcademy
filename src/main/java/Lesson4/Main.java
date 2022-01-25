package Lesson4;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[]arrayInts = new int[25];

        arrayInts[0] = 0;
        arrayInts[1] = 1;
        Scanner test = new Scanner(System.in);
        String exit;

        while (true) {
            System.out.println("Для продолжения нажмите любую клавишу. Для выхода напишите 'exit'");
             exit = test.nextLine();
            if (exit.equals("exit"))
                break;
            System.out.println("Программа активна");
            System.out.println("введите номер элемента ряда фибоначи от 0 до 25");
            int elm = test.nextInt();
            if(elm == 1){
                System.out.println(arrayInts[0]);
            }else if(elm == 2){
                System.out.print(arrayInts[0] + " ");
                System.out.println(arrayInts[1]);
            }
            else if(elm > 2){
                System.out.print(0 + " ");
                System.out.print(1 + " ");
            }
            int i = 2;
            while(i < elm) {
                arrayInts[i] = arrayInts[i -1] + arrayInts[ i - 2];
                System.out.print(arrayInts[i] + " ");
                i ++;
            }
            exit = test.nextLine();
            if (exit.equals("exit"))
                break;
        }
        System.out.println("программа закончила работу");

    }

}


