package FamilyTree;


import java.time.LocalDate;


public class Human implements People{
    private String name;
    private LocalDate birthday;
    private Relationship gender;

    public Human(String name,int year, int month, int day, Relationship gender) {
        this.name = name;
        this.birthday = LocalDate.of(year, month, day);
        this.gender = gender;
    }

    public Relationship getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return
                name;
    }
}