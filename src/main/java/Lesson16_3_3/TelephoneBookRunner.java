package Lesson16_3_3;

import java.time.Duration;
import java.time.Instant;

public class TelephoneBookRunner {
    public static void main(String[] args) throws InterruptedException {
        BookPhone bookPhone1 = new BookPhone();
        //работаем с массивом
       // Instant startArr = Instant.now();
       bookPhone1.addList();
       Abonent secondAbonent = (Abonent) bookPhone1.list.get(10);
       secondAbonent.listFriends.add(0, bookPhone1.list.get(12));
        System.out.println(bookPhone1);
        //System.out.println(bookPhone1.list.get(2));






        /*
       Thread.sleep(1000);
       Instant finishArr = Instant.now();
       Long elapsedArr = Duration.between(startArr,finishArr).toMillis();
        System.out.println(" прошло времени на массиве, мс " + elapsedArr);

        //работаем с List(список)
        BookPhone bookPhone2 = new BookPhone();
        Instant startList = Instant.now();
        bookPhone2.addList();
        Thread.sleep(1000);
        Instant finishList = Instant.now();
        Long elapsedList = Duration.between(startList,finishList).toMillis();
        System.out.println(" прошло времени на List, мс " + elapsedList);
        //System.out.println(bookPhone);

         */

    }
}
