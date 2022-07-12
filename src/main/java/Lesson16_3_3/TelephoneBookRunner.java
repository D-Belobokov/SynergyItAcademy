package Lesson16_3_3;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TelephoneBookRunner {
    public static void main(String[] args) throws InterruptedException {
        BookPhone bookPhone1 = new BookPhone();
        //работаем с массивом
       // Instant startArr = Instant.now();
       bookPhone1.addList();
        Iterator iteratorList = bookPhone1.list.iterator();
        while (iteratorList.hasNext()){
            System.out.println(iteratorList.next());
        }
        /*
        Abonent temp = (Abonent) bookPhone1.list.get(2);
        System.out.println(" temp = " + temp);
        temp.listFriends.add(bookPhone1.list.get(5));
        System.out.println(" temp modify " + temp);
        bookPhone1.list.add(2,temp);
        System.out.println("bookfone.2 " + bookPhone1.list.get(2));

         */

















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
