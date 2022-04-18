package CollectionTraining;

public class Unit  {
    String fio;
    int age;

    @Override
    public String toString() {
        return "Unit{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                '}';
    }
    Unit(String fio, int age){
        this.fio = fio;
        this.age = age;
    }

}
