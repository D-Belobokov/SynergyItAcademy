package Lesson4;

import java.util.Scanner;

public class Teat {
    public static void main(String[] args) {
        int[]fibonach = new int[10];
        fibonach[0] = 0;
        fibonach[1] = 1;
        Scanner test = new Scanner(System.in);
        System.out.println("введите номер элемента");
        int v = test.nextInt();
        for(int i = 2; i < fibonach.length; i++ ){
            fibonach[i] = fibonach[i -1] + fibonach[i - 2];
            System.out.print(fibonach[i] + " ");
        }
    }
}

