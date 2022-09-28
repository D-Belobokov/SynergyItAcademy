package Lesson19_3_7.Test;

public class MyThread implements Runnable{
    String thrdName;
    MyThread(String thrdName){
        this.thrdName = thrdName;
    }

    @Override
    public void run() {
        System.out.println(" стартует поток " + thrdName + Thread.currentThread().getId());
        try {
           Thread.sleep(3000);

        } catch (InterruptedException e) {
            System.out.println(" поток " + thrdName + " приостановлен " );
        }
        System.out.println(" поток " + thrdName + " завершен ");
    }
}
