package CollectionsTrainingBase.ArrayList;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
/*связанный список*/

public class LinkedListRunner {
    public static void main(String[] args) {
        String str1 = new String("Hello World!");
        String str2 = new String("My name is Earl");
        String str3 = new String("I love Java");
        String str4 = new String("I live in Moscow");
        String str5 = new String("Я тестирую LinkedList");

        List<String> earlBio = new LinkedList<>();
        earlBio.add(str1);
        earlBio.add(str2);
        earlBio.add(str3);
        earlBio.add(str4);
        earlBio.add(0,str5);
        System.out.println(earlBio);

        Set<String>stringSet = new HashSet<>(earlBio);
        System.out.println(" помещаем LinkedList в HashSet для сортировки " + stringSet);
    }
}
