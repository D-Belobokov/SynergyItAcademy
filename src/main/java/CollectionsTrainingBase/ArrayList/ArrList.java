package CollectionsTrainingBase.ArrayList;

import java.util.*;

public class ArrList {
    public static void main(String[] args) {

        List<Unit> unitList = new ArrayList<>();
        Unit unit = new Unit("Vasya", 12);
        Unit unit1 = new Unit("Petya", 15);
        Unit unit2 = new Unit("Dima", 10);
        Unit unit3 = new Unit("Fedya", 18);
        Unit unit4 = new Unit("Grisha", 21);

        unitList.add(unit);
        unitList.add(unit1);
        unitList.add(unit2);
        unitList.add(unit3);
        unitList.add(unit4);

        Collections.sort(unitList);
        System.out.println("сортировка по age с помощь метода compareTo");
        System.out.println(unitList);
        System.out.println("сортировка по id с помощью компаратора");
        Comparator unitComparatorId = new UnitComparatorID();
        Collections.sort(unitList, unitComparatorId);
        System.out.println(unitList);
    }
}
