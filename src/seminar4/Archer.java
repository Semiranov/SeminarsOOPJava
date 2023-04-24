package seminar4;

public class Archer extends  Warrior <Throwing, Shield> {
    public Archer(String name, int hp, Throwing trowing, Shield shield) {
        super(name, hp, trowing, shield = null);
    }
    public int getRange(){
        return random.nextInt(weapon.getDistance() + 1);
    }

    @Override
    public String toString() {
        return "Archer " +
                super.toString();
    }
}
