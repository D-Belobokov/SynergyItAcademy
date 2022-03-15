package Lesson13_2_5;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Avatar avatar = new Avatar("Вася");
        System.out.println(" симулятор банкомата ");
        while (true) {
            System.out.println(" выберите действие:информация о счете-'prt' пополнить счет-'up' - снять деньги-'off' выход-'exit'");
            try {
                // ниже получаем private поле "score" и записываем в переменную "fieldScore"
                Field fieldScore = avatar.getClass().getDeclaredField("score");
                // разрешаем к нему доступ
                fieldScore.setAccessible(true);
                Scanner scanner = new Scanner(System.in);
                String operation = scanner.nextLine();
                if (operation.equals("exit")) {
                    break;
                }
                if (operation.equals("prt")) {
                    avatar.print();
                }
                if (operation.equals("up")) {
                    //ниже получаем private метод
                    Method methodUp = avatar.getClass().getDeclaredMethod("topUp", BigDecimal.class);
                    methodUp.setAccessible(true);
                    System.out.println(" введите сумму для пополнеия ");
                    String cashUp = scanner.nextLine();
                    BigDecimal upp = new BigDecimal(cashUp);
                    // ниже применяем метод invoke на полученном private методе "topUp"
                    methodUp.invoke(avatar, upp);

                }
                if (operation.equals("off")) {
                    Method methodOff = avatar.getClass().getDeclaredMethod("takeOff", BigDecimal.class);
                    methodOff.setAccessible(true);
                    System.out.println("введите сумму для снятия");
                    String vOff = scanner.nextLine();
                    BigDecimal of = new BigDecimal(vOff);
                    methodOff.invoke(avatar, of);
                }
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        avatar.print();
        System.out.println("Досвидания!");
    }
}
