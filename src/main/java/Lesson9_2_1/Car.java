package Lesson9_2_1;

public class Car implements Cloneable {
    String brand;
    String model;
    Engine  engine ;
    public Car(String brand, String model, Engine engine){
        this.brand = brand;
        this.model = model;
        this.engine = new Engine();
        this.engine.name = engine.name;
        this.engine.value = engine.value;
    }
    public Car(){}
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine name=" + engine.name + '\'' +
                ", engine.value=" + engine.value + '\'' +
                '}';
    }
    @Override
    public Car clone() throws CloneNotSupportedException{
        Car car = new Car();
        car.brand = brand;
        car.model = model;
        car.engine = engine;
        return car;
    }
    static class Engine implements Cloneable{
        int value;
        String name;
        public Engine(int value,String name){
            this.value = value;
            this.name = name;
        }
        public Engine(){
        }
        @Override
        public Engine clone() throws CloneNotSupportedException{
           return (Engine) super.clone();
        }
    }
}
