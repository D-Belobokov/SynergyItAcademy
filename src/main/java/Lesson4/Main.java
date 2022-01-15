package Lesson4;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //System.out.println("введите номер элемента ряда Фибоначи");
        //int el = scanner.nextInt();
        BigInteger[] arrayInts = new BigInteger[100];
        for (int i = 0; i < arrayInts.length; i++) {
            arrayInts[i] = BigInteger.ONE;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("введите номер члена ряда фибоначчи");
        int var = sc.nextInt();
        if(var < 2){
            for (int i = 1;i <3 ;i ++){
                System.out.println(" элемент № " + i + " = " + 1);
            }
        }else for (int j=1;j<var+1;j++){
            System.out.println(" элемент " + j + " = " + arrayInts[j]);
        }
        }
    }

