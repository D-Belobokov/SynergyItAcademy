package Test;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BigInteger total = new BigInteger("1000000");
        BigInteger[] fibonachi = new BigInteger[total.intValue()];
        fibonachi[0] = BigInteger.ZERO;
        fibonachi[1] = BigInteger.ONE;
        fibonachi[2] = BigInteger.ONE;
        fibonachi[3] = BigInteger.TWO;

        Scanner sr = new Scanner(System.in);
        System.out.println("введите номер позиции ряда фибо");
        int value = sr.nextInt();

                for (int i = 0;i < value ; i ++){
           System.out.println(fibonachi[i]);
        }
        Object object = new Object();
             int  t = 2;
              t = object.hashCode();
        System.out.println(t);
    }

}
