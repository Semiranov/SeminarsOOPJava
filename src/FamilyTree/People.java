package FamilyTree;

import java.time.LocalDate;

public abstract class People {
    private String name;
    private LocalDate birthday;
    private Relationship gender;

    public Relationship getGender() {
        return gender;
    }

    public void setGender(Relationship gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

}
