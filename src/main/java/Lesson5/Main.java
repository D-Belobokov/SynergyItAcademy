package Lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println(" введите велечину 'm' для матрицы ");
        int m = sr.nextInt();
        System.out.println(" введите велечину 'n' для матрицы ");
        int n = sr.nextInt();
        System.out.println(" введите число , для умножения матрицы ");
        int l = sr.nextInt();

        Matrix defolt = new Matrix();
        defolt.matrixFill();
        defolt.matrixPrint();

        Matrix m1 = new Matrix(m, n);
        m1.matrixFill();
        m1.matrixPrint();

        Matrix m2 = new Matrix(m, n);
        m2.matrixFill();
        m2.matrixPrint();

        Matrix summa = m1.matrixSumma(m2);
        summa.matrixPrint();

        Matrix delite = m1.delite(m2);
        delite.matrixPrint();

        Matrix mutipicat = m1.multiplicatMatrix(l);
        mutipicat.matrixPrint();
    }
}
