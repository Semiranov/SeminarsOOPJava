package seminar1_3;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Npc implements NpcInterface {
    private int attack;      //атака
    private int defence;   //защита
    private int shoot;
    private int[] damage;     // макс хп
    private int health;     // скорость
    private int speed;    //макс. урон
    private boolean delivery;//мин. урон
    private boolean magic;
    private int maxHealth;
    private String name;
    protected ArrayList<Npc> group;

    public Npc(int attack, int defence, int shoot, int[] damage, int maxHealth, int speed,
               boolean delivery, boolean magic, String name) {
        this.attack = attack;
        this.defence = defence;
        this.shoot = shoot;
        this.damage = damage;
        this.health = maxHealth;
        this.speed = speed;
        this.delivery = delivery;
        this.magic = magic;
        this.maxHealth = maxHealth;
        this.name = name;
    }

    @Override
    public String toString() {
        return name +
                ": атака=" + attack +
                ", защита=" + defence +
                ", выстрелы=" + shoot +
                ", урон=" + Arrays.toString(damage) +
                ", жизнь=" + health +
                ", скорость=" + speed +
                ", защита=" + delivery +
                ", магия=" + magic;

    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int[] getDamage() {
        return damage;
    }

    public String getInfo() {
        return "";
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void Step(ArrayList<Npc> group) {

    }
}
