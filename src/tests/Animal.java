package tests;

public class Animal {
    private int id;

    public Animal() {
    }
    public Animal(int id) {
        this.id = id;
    }

    public void eat(){
        System.out.println("animal is eating...");
    }

    @Override
    public String toString() {
        return "id=" + id;
    }
}
