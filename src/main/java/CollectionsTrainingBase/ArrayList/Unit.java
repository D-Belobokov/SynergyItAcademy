package CollectionsTrainingBase.ArrayList;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Setter
@Getter

public class Unit implements Comparable<Unit>  {
    private String fio;
    private int age;
    private int id;


    public Unit(String fio, int age){
        this.fio = fio;
        this.age = age;
        Random r = new Random();
        this.id = r.nextInt(10000);
    }

    @Override
    public String toString() {
        return "Unit{" +
                "fio='" + fio  +
                ", age=" + age +
                ", id=" + id +
                '}' +
                "\n";
    }

    @Override
    public int compareTo( Unit o) {
        return getAge() - o.getAge();
    }
}
