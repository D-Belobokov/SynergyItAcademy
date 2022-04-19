package CollectionsTrainingBase.ArrayList;

import java.util.Comparator;
//класс компаратора. задаем сортировку по id

public class UnitComparatorID implements Comparator<Unit> {
    @Override
    public int compare(Unit o1, Unit o2) {
        return o1.getId() - o2.getId();
    }
}
