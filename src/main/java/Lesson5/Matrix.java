package Lesson5;

import java.util.Random;

public class Matrix {
    private int m;
    private int n;
    private int[][] arr;
    static int counter_param = 1;
    static int counter_def = 1;

    //квадратная матрица
    public Matrix() {
        System.out.println(" # создана квадратная матрица по умолчанию № " + counter_def + " #");
        this.m = 2;
        this.n = 2;
        this.arr = new int[this.m][this.n];
        counter_def++;
    }
    //матрица(перегруженный конструктор)
    public Matrix(int m, int n) {
        System.out.println(" # создана матрица с заданными параметрами № " + counter_param + " #");
        this.m = m;
        this.n = n;
        this.arr = new int[this.m][this.n];
        counter_param++;
    }

    public int getN() {
        return n;
    }
    public int getM() {
        return m;
    }
    public int[][] getArr() {
        return arr;
    }

    //медод распечатки
    public void matrixPrint() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        }
    }
    //метод для заполнения массива
    public void matrixFill() {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(10);
            }
        }
    }
    //метод для сложения матриц 1.0
    public Matrix matrixSumma(Matrix p) {
        System.out.println(" сложение матриц");
        Matrix rezult = new Matrix(this.m, this.n);
        for (int i = 0; i < rezult.arr.length; i++) {
            for (int j = 0; j < rezult.arr[i].length; j++) {
                rezult.arr[i][j] = arr[i][j] + p.arr[i][j];
            }
        }
        return rezult;
    }
    /*метод для сложения матриц 2.0//не работает если матрицы разные по размеру.
   public Matrix Sum( Matrix x, Matrix y){
        Matrix rezult2 = new Matrix(this.m = x.m  ,this.n = x.n );
       for (int i = 0; i < rezult2.arr.length;i ++){
           for (int j = 0; j < rezult2.arr.length; j ++){
               rezult2.arr[i][j] = y.arr[i][j] + x.arr[i][j] ;
           }
       }
       return rezult2;
   }
     */
    //метод для вычитания матриц
    public Matrix delite(Matrix m) {
        System.out.println("вычитание матриц");
        Matrix delite = new Matrix(this.m, this.n);
        for (int i = 0; i < delite.arr.length; i++) {
            for (int j = 0; j < delite.arr[i].length; j++) {
                delite.arr[i][j] = arr[i][j] - m.arr[i][j];
            }
        }
        return delite;
    }
    //метод умножения матрицы на число
    public Matrix multiplicatMatrix(int mult) {
        System.out.println("умножение матрицы на число");
        Matrix multiplicat = new Matrix(this.m, this.n);
        for (int i = 0; i < multiplicat.arr.length; i++) {
            for (int j = 0; j < multiplicat.arr[i].length; j++) {
                multiplicat.arr[i][j] = arr[i][j] * mult;
            }
        }
        return multiplicat;
    }
}


