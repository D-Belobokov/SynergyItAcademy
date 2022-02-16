package Test;

import java.math.BigInteger;
import java.util.Scanner;

public class TestArrBigInteger {
    public static void main(String[] args) {
        int count = 2;
        int t;
        int[]fiboArr = new int[count];
        fiboArr[0] = 0;
        fiboArr[1] = 1;

        //int count = 2; // счетчик -> номер элемента фибоначи в массиве fiboArr
        do {
            //int t;
            System.out.println("введите номер элементв ряда фибоначчи, для вычисления его значения или exit для выхода");
            Scanner sr = new Scanner(System.in);
            String ext = sr.nextLine();
            if(ext.equals("exit")){
                break;
            }else {
                t = Integer.parseInt(ext);
                if (t <= count) {
                    System.out.println(" заданное число меньше или равно существующему массиву fiboArr");
                    System.out.println(fiboArr[t - 1]);
                } else {
                    count = t;
                    for (int i = 2; i < t; ++i) {
                        fiboArr[i] = fiboArr[i - 1] + fiboArr[i - 2];
                    }
                    System.out.println(fiboArr[t - 1]);
                }
            }
        }while (true);
    }
}
