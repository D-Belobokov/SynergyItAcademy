package Lesson16_3_3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Abonent {
    String name;
    long number;
    ArrayList<Abonent> friends = new ArrayList<>();
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
        int z = random.nextInt((int) TelephoneBook.capacityBook);
        for (int j = 0; j < 150; j ++){
        }
    }

    @Override
    public String toString() {
        return " Abonent{" +
                "'name' = " + name + '\'' +
                ", number = " + number +
                '}' +
                '\n';
    }
}
