package Lesson7.Obstacles;

import Lesson7.Interface.ObstaclesFs;

import java.util.Random;

public class Road implements ObstaclesFs {

    Random random = new Random();
    public int[] roadArr;

    public Road() {
        this.roadArr = new int[ARR_SIZE];
        for (int i = 0; i < roadArr.length; i++) {
            roadArr[i] = random.nextInt(10);
        }
    }
}
