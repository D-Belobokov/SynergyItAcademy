package Lesson8;

import Lesson8.Konverters.Konvert_C_F;
import Lesson8.Konverters.Konvert_C_K;
import Lesson8.Konverters.Konvert_F_K;
import Lesson8.Konverters.Konvert_K_F;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Konvert_C_F konvert_c_f = new Konvert_C_F();
        Konvert_C_K konvert_c_k = new Konvert_C_K();
        Konvert_F_K konvert_f_k = new Konvert_F_K();
        Konvert_K_F konvert_k_f = new Konvert_K_F();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(" выбор котвертора:" +"\n" + " 1 - цельсий -> фаренгейт " + "\n" +
                    " 2 - цельсий -> кельвин   " + "\n" + " 3 - фаренгейт -> кельвин " + "\n"+
                    " 4 - кельвин -> фаренгейт " + "\n" + " для выхода нажмите 777 " + "\n" );
            int var = scanner.nextInt();
            if (var == 777) {
                break;
            }
            switch (var) {
                case 1:
                    System.out.println(" конвертация градусов в форенгейты ");
                    System.out.println(" введите количество градусов");
                    double cel_f = scanner.nextInt();
                    System.out.print(" значение в фаринтейтах = F ");
                    System.out.printf("%.2f", konvert_c_f.konverter(cel_f));
                    System.out.println();
                    break;
                case 2:
                    System.out.println(" конвертация градусов в кельвины ");
                    System.out.println(" введите количество градусов ");
                    double cel_k = scanner.nextInt();
                    System.out.print(" значения в кельвинах = К ");
                    System.out.printf("%.2f", konvert_c_k.konverter(cel_k));
                    System.out.println();
                    break;
                case 3:
                    System.out.println(" конвертация фарингейтов в кельвины ");
                    System.out.println(" введите количество фарингейтов ");
                    double f_k = scanner.nextInt();
                    System.out.print(" значение в кельвинах = К ");
                    System.out.printf("%.2f", konvert_f_k.konverter(f_k));
                    System.out.println();
                    break;
                case 4:
                    System.out.println(" конвертация кельвинов в фарингейты ");
                    System.out.println(" введите кельвины ");
                    double k_f = scanner.nextInt();
                    System.out.print(" значение в фарингейтах = F");
                    System.out.printf("%.2f", konvert_k_f.konverter(k_f));
                    System.out.println();
                    break;
                default:
                    System.out.println(" выбор от 1 до 4, попробуйте еще раз");
            }
        }while (true);
    }
}
