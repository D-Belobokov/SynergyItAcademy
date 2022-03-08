package Lesson13_2_5;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Scanner;

public class testInvoke {
    public static void main(String[] args) {
        Avatar avatar = new Avatar("t200");

        try {
            Field fieldScore = avatar.getClass().getDeclaredField("score");
            fieldScore.setAccessible(true);
            Method methodUp = avatar.getClass().getDeclaredMethod("topUp", BigDecimal.class);
            System.out.println("введите сумму пополнения");
            Scanner sc = new Scanner(System.in);
            String v = sc.nextLine();
            BigDecimal in = new BigDecimal(v);
            methodUp.invoke(avatar,in);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
