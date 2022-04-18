package CollectionTraining;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class ArrList {
    public static void main(String[] args) {
        Unit unit = new Unit("Vasya", 12);
        Unit unit1 = new Unit("Petya", 15);
        Unit unit2 = new Unit("Dima", 10);
        Unit unit3 = new Unit("Fedya", 18);
        Unit unit4 = new Unit("Grisha", 21);

        List<Unit> unitList = new ArrayList<>();
        unitList.add(unit);
        unitList.add(unit1);
        unitList.add(unit2);
        unitList.add(unit3);
        unitList.add(unit4);
        unitList.add(5, unit);

        System.out.println(unitList.contains(unit1));

        Comparator<Unit> comparator = new Comparator<Unit>() {

            public int compare(Unit o1, Unit o2) {
                return o1.age;
            }
        };
    }

}
