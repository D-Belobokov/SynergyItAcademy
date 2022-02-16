package Lesson6;

public class Animal implements Animals {
    String name;
    String sound;

    public Animal(String name, String sound){
        this.name = name;
        this.sound = sound;
    }

    @Override
    public void voice() {
        System.out.println(name + " сказал(а) " + sound);
    }
}
