package Lesson16_3_3.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cat {
    String name;
    int age;
    List<Cat>friends;

    public Cat(String name,int age){
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<Cat>();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ",friends=" + friends + '\'' +
                '}';
    }
}
