package Lesson17_3_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Abonent {
    String name;
    long number;
    List listFriends = new ArrayList<>(5);//список связанных контактов

        String[] nameArr = {"Вася", "Петя", "Ваня", "Дима", "Коля", "Саша", "Слава", "Костя", "Андрей", "Паша"};
        String[] lastnameArr = {"Иванов", "Петров", "Сидоров", "Круглов", "Хазанов", "Жванецкий", "Задорнов", "Кроликов",
                "Маменко", "Рабинович"};

    public Abonent(){
        Random random = new Random();
        int x = random.nextInt(10);
        int y = random.nextInt(10);
        long lowerBound = 9000000000l;
        long upperBound = 9319999999l;
        this.name = nameArr[x] + " " + lastnameArr[y];
        this.number = new Random().nextInt((int) (upperBound - lowerBound)) + lowerBound;
        this.listFriends = new ArrayList<Abonent>();
    }

    @Override
    public String toString() {
        return "Abonent{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", listFriends=" + listFriends +
                "\n" +
                '}';
    }
}
