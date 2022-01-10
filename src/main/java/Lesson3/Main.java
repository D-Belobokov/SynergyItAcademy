package Lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int [] fibo ;
       fibo = new int[20];
       fibo[0] = 0;
       fibo[1] = 1;
        System.out.println("числа фибоначи");
        System.out.println("**************");
        for(int i = 2; i < fibo.length; i++ ){
            fibo[i] = fibo[i -1] + fibo[i - 2];
            System.out.print(fibo[i] + " ");
        }
        System.out.println("\n" + "**************");
        System.out.println("Корни квадратного уравнения");


        Scanner ratio = new Scanner(System.in);
        System.out.println("введите значение коэфф.'a'");
        int a = ratio.nextInt();
        if(a==0){
            System.out.println(" коэфф а не может быть равным нулю ");
            System.out.println("введите значение коэфф.'a'");
        } else System.out.println("введите значение коэфф.'a'");
               a = ratio.nextInt();

        System.out.println("введите значение коэфф.'b'");
        int b = ratio.nextInt();
        System.out.println("введите значение коэфф.'c'");
        int c = ratio.nextInt();
        float d = b*b - 4*a*c; // дискриминант
        float x1;
        float x2;
        System.out.println("Дискриминант равен = " + d);
        System.out.println("корень из d = " + Math.sqrt(d));
        if(d > 0) {x1 = (float) (-b + Math.sqrt(d))/(2*a) ; x2 = (float) (-b - Math.sqrt(d))/(2*a);
            System.out.println("уравнение имеет 2 корня x1 = " + x1 + " x2 = " + x2);
        }else if(d == 0){x1 =(float) -b/(2*a);
            System.out.println("уравнение имеет 1 корень x1 = " + x1);
        }else if(d < 0){
            System.out.println("уравнение корней не имеет");
        }
    }
}
