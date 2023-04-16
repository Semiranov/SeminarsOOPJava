package seminar4;

public class Archer extends Warrior { // Лучник
    private int attackDistance;

    public Archer(String name, int hp, Weapon weapon, int attackDistance) {
        super(name, hp, weapon);
        this.attackDistance = attackDistance;
    }
}
