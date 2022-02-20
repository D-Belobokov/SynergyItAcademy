package Lesson7;

import Lesson7.Obstacles.Road;
import Lesson7.Obstacles.Wall;
import Lesson7.Units.Cat;
import Lesson7.Units.Human;
import Lesson7.Units.Kiborg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            Wall wall = new Wall();
            Road road = new Road();
            Cat cat = new Cat(" Барсик");
            Human human = new Human(" Синее тело ");
            Kiborg kiborg = new Kiborg("Жидкий робот");
            System.out.println(" кого будем гонять? : кот = 1 человек = 2 робот = 3 или exit для выхода");
            String v = sc.nextLine();
            if ("exit".equals(v)) {
                break;
            }
            int number = Integer.parseInt(v);
            int totalRoad = 0;
            if (number == 1) {
                for (int i = 0; i < wall.wallArr.length; i++) {
                    totalRoad = totalRoad + road.roadArr[i];
                    if (wall.wallArr[i] < cat.jumpLimit && cat.distanceLimit > totalRoad) {
                        cat.run();
                        cat.jump();
                    } else {
                        cat.gameOver();
                        break;
                    }
                }
            }
            if (number == 2) {
                for (int i = 0; i < wall.wallArr.length; i++) {
                    totalRoad = totalRoad + road.roadArr[i];
                    if (wall.wallArr[i] < kiborg.jumpLimit && kiborg.distanceLimit > totalRoad) {
                        kiborg.run();
                        kiborg.jump();
                    } else {
                        kiborg.gameOver();
                        break;
                    }
                }
            }
            if (number == 3) {
                for (int i = 0; i < wall.wallArr.length; i++) {
                    totalRoad = totalRoad + road.roadArr[i];
                    if (wall.wallArr[i] < human.jumpLimit && human.distanceLimit > totalRoad) {
                        human.run();
                        human.jump();
                    } else {
                        human.gameOver();
                        break;
                    }
                }
            }
        } while (true);
    }
}
