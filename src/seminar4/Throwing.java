package seminar4;

public abstract class Throwing implements Weapon {

    protected int distance;

    public Throwing(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Throwing{" +
                "damage" + damage() +
                "distance=" + distance +
                '}';
    }

    @Override
    public int damage() {
        return 0;
    }
}
