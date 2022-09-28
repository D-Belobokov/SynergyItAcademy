package Lesson19_3_7.Test;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ThreadTest extends Thread{

    private final String name;

    @Override
    public void run(){
        System.out.println(" Старт потока " + name + "\n" +
                " ID = " + Thread.currentThread().getId());
    }
}
