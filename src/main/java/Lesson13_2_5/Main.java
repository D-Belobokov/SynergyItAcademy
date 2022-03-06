package Lesson13_2_5;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Avatar avatar = new Avatar();
        avatar.score = BigDecimal.valueOf(0);
        Avatar avatar1 = new Avatar();
        avatar1.score = BigDecimal.valueOf(12);
        Avatar avatar2 = new Avatar();
        avatar2.score = BigDecimal.valueOf(43);
        while (true){
            System.out.println(" введите сумму пополнения счета или exit для  выхода ");
            Scanner scanner = new Scanner(System.in);
            String t = scanner.nextLine();
            if(t.equals("exit")){
                break;
            }else {
                BigDecimal rub = new BigDecimal(t.toString());
                avatar.insite(rub);
            }
        }
        System.out.println(avatar.score);
        System.out.println(avatar1.score);
        System.out.println(avatar2.score);
    }
}
