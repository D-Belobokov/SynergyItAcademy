package Lesson13_2_5;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Avatar avatar = new Avatar("Вася");
        System.out.println(" симулятор банкомата. работаем со счетом васи ");
        while (true){
            System.out.println(" выберите действие:информация о счете-'prt' пополнить счет-'up' - снять деньги-'off' выход-'exit'");
            try {
                Field fieldScore = avatar.getClass().getDeclaredField("score");
                fieldScore.setAccessible(true);
                Scanner scanner = new Scanner(System.in);
                String operation = scanner.nextLine();
                if (operation.equals("exit")){
                    break;
                }
                if(operation.equals("prt")){
                    avatar.print();
                }
                if (operation.equals("up")){
                    System.out.println(" введите сумму для пополнеия ");
                    Method methodUp = avatar.getClass().getDeclaredMethod("topUp");
                    methodUp.setAccessible(true);
                    methodUp.invoke(avatar);
                   String vUp = scanner.nextLine();
                   BigDecimal valueUp = new BigDecimal(vUp);
                  avatar.topUp(valueUp);
                }
                if(operation.equals("off")){
                    System.out.println("введите сумму для снятия");
                    String vOff = scanner.nextLine();
                   BigDecimal valueOff = new BigDecimal(vOff);
                   avatar.takeOff(valueOff);
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
    }
}
