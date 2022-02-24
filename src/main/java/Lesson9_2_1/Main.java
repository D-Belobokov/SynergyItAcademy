package Lesson9_2_1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car ford = new Car("ford","focus",new Car.Engine(2,"duratec"));
        System.out.println(" исходный автомобиль " + ford);

        Car kia = ford.clone();
        System.out.println(" клон " + kia);
        kia.brand = " korean";
        kia.model = " rio";
        kia.engine.name = " doch";
        kia.engine.value = 1;
        System.out.println(" клон полсле изменений " + kia);
        System.out.println(" исходный авто " + ford);
    }
}
