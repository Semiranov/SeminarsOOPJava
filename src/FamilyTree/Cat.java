package FamilyTree;

public class Cat extends People{
    People owner;
    public Cat(String name, Human owner) {
        super.setName(name);
        this.owner = owner;
    }

    @Override
    public String toString() {
        return
                super.getName();
    }


}
