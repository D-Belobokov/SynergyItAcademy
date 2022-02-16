package Lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" вычисляем элемент ряда фибоначчи с использованием кэширования ");
        Scanner sc = new Scanner(System.in);
        int count = 2;
        do {
            System.out.println("введите номер последовательности для вычисления или exit для выхода");
            String var = sc.nextLine();
            if ("exit".equals(var)) {
                break;
            }
            int number = Integer.parseInt(var);
            if(number == 1){
                System.out.println("значение элемента № 1 = " + 0);
            }else {
                int[] fiboArr = new int[number];
                fiboArr[0] = 0;
                fiboArr[1] = 1;
                    if (count <= number)
                        for (int i = 2; i < number; i++) {
                            fiboArr[i] = fiboArr[i - 1] + fiboArr[i - 2];
                        }
                System.out.println(" значение элемента № " + number + " = " + fiboArr[number - 1]);
            }
        }while (true);
    }
}





