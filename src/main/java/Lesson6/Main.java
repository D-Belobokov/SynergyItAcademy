package Lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Animal[] animalsArr = new Animal[2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < animalsArr.length; i ++){
            System.out.println(" введите тип животного");
            String nameVar = scanner.nextLine();
            System.out.println(" введите издаваемый животным звук ");
            String soundVar = scanner.nextLine();
            animalsArr[i] = new Animal(nameVar,soundVar);

        }
        System.out.println("*****************************");
        for (int j = 0; j < animalsArr.length; j ++){
            animalsArr[j].voice();
        }

    }
}
