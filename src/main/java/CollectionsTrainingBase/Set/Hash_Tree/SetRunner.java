package CollectionsTrainingBase.Set.Hash_Tree;

import CollectionsTrainingBase.ArrayList.Unit;

import java.util.*;

public class SetRunner {
    public static void main(String[] args) {
        HashSet<Unit>hashSetUnit = new HashSet<>();
        Unit unit1 = new Unit("Sasha", 23);
        Unit unit2 = new Unit("Olya", 15);
        Unit unit3 = new Unit("Vova", 21);
        Unit unit4 = new Unit("Slava" , 17);
        Unit unit5 = new Unit("Fedor",12);

        hashSetUnit.add(unit1);
        hashSetUnit.add(unit2);
        hashSetUnit.add(unit3);
        hashSetUnit.add(unit4);
        hashSetUnit.add(unit5);
        hashSetUnit.add(unit1);//дубликат
        System.out.println(hashSetUnit);

        //преобразуем в list для сортировки

        List<Unit>listhashSet = new ArrayList<>(hashSetUnit);
        Collections.sort(listhashSet);
        System.out.println("после сортировки");
        System.out.println(listhashSet);
        //прокидываем в TreeSet, там автоматически отсортируется
        TreeSet<Unit>unitTreeSet = new TreeSet<>();
        unitTreeSet.addAll(hashSetUnit);
        System.out.println(" сортируем перемещением в treeSet " + "\n" + unitTreeSet);

    }
}
