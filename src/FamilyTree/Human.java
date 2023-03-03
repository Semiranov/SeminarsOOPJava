package FamilyTree;


import java.time.LocalDate;


public class Human extends People{
//    private String name;
//    private LocalDate birthday;
//    private Relationship gender;

    public Human(String name,int year, int month, int day, Relationship gender) {
        setName(name);
        setBirthday(LocalDate.of(year, month, day));
        super.setGender(gender);
    }

//    public Relationship getGender() {
//        return gender;
//    }
//
//    public String getName() {
//        return super.getName();
//    }

    @Override
    public String toString() {
        return
                super.getName();
    }
}