package FamilyTree;

import java.time.LocalDate;


public class Human {
    private String name;
    private LocalDate birthday;
    private String gender;

    public Human(String name,int year, int month, int day, String gender) {
        this.name = name;
        this.birthday = LocalDate.of(year, month, day);
        this.gender = gender;
    }

    public String getGender() {
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