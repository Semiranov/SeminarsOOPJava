package FamilyTree;

import java.time.LocalDate;

public class Cat implements People {
    private String name;
    private Relationship gender;

    public Cat(String name, Relationship gender) {
        this.name = name;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public Relationship getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name;
    }
}
