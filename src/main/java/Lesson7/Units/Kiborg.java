package Lesson7.Units;

import Lesson7.Interface.Unit;

import java.util.Random;

public class Kiborg implements Unit {
    public int distanceLimit;
    public int jumpLimit;
    public String name;
    Random random = new Random();

    public Kiborg(String name) {
        this.name = name;
        this.distanceLimit = random.nextInt(30);
        this.jumpLimit = random.nextInt(50);
    }

    @Override
    public void run() {
        System.out.println(name + " бежит ");
    }

    @Override
    public void jump() {
        System.out.println(name + " прыгнул ");
    }

    @Override
    public void gameOver() {
        System.out.println(name + " сошел с пробега ");
    }
}
