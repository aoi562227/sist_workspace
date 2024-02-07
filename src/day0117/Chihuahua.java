package day0117;

public class Chihuahua extends Homework {
    public Chihuahua(String name, int weight, String color) {
        super("Chihuahua", name, weight, color);
    }
    
    @Override
    public void bark() {
    	System.out.println(getName() + " : 깽");
    }

    @Override
    public void specialAction() {
        System.out.println("썰 풀기");
    }
}

