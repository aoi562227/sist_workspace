package day0117;

public class Malamute extends Homework {
    public Malamute(String name, int weight, String color) {
        super("Malamute", name, weight, color);
    }

    @Override
    public void specialAction() {
        System.out.println("가오잡기");
    }
}

