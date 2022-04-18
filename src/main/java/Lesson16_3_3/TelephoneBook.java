package Lesson16_3_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TelephoneBook {
    static long capacityBook = 1000;
    ArrayList<Abonent>bookArray = new ArrayList<>();
    Set<Abonent>bookSet = new HashSet<>();


    public TelephoneBook(){
        for (int i = 0 ; i < capacityBook; i ++){
            bookArray.add(new Abonent());
        }
        for (int i = 0 ; i < capacityBook; i ++){
            bookSet.add(new Abonent());
        }
    }
    @Override
    public String toString() {
        return  "TelephoneBook{" +
                '\n' +
                " BookArray=" +
                '\n' +
                bookArray +
                '\n' +
                "*********************" +
                '\n' +
                " BookSet="+
                '\n' +
                  bookSet +
                '}';
    }
}
