package day0117;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Homework {
    private String breed;
    private String name;
    private int weight;
    private String color;

    public Homework(String breed, String name, int weight, String color) {
        this.breed = breed;
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public void bark() {
        System.out.println(getName() + " : 멍");
    }

    public void run() {
        System.out.println("달리기");
    }

    public abstract void specialAction();
}

