package Lesson19_3_7.Test;

public class LoggerRun {
    public static void main(String[] args)  {

       Thread t1 = new ThreadTest(" Test ");
       t1.start();

        Runnable threadX = () ->{

            System.out.println(" работает threadX ID = " + Thread.currentThread().getId());
        };
        threadX.run();

    }
}
