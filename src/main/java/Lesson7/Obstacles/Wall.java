package Lesson7.Obstacles;

import Lesson7.Interface.ObstaclesFs;

import java.util.Random;

public class Wall implements ObstaclesFs {
    Random random = new Random();
    public int[] wallArr;

    public Wall() {
        this.wallArr = new int[ARR_SIZE];
        for (int i = 0; i < wallArr.length; i++) {
            wallArr[i] = random.nextInt(10);
        }
    }

    public void print() {
        for (int j = 0; j < wallArr.length; j++) {
            System.out.println(wallArr[j]);
        }
    }
}
