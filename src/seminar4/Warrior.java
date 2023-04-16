package seminar4;

import java.util.Random;

public class Warrior extends Person { // Воин
    protected Weapon weapon;
    protected static Random rand = new Random();

    public Warrior(String name, int hp) {
        super(name, hp);
    }

    public Warrior(String name, int hp, Weapon weapon) {
        super(name, hp);
        this.weapon = weapon;
    }

    public int Harm() { //атака
        boolean isHit = rand.nextBoolean();
        int damage = 0;
        if (isHit) {
            damage = rand.nextInt(weapon.damage() + 1);
        }
        return damage;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name= " + getName() +
                " hp = " + getHp() +
                " weapon= " + weapon +
                '}';
    }
}
