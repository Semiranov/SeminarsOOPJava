package seminar4;

import java.util.Random;

public class Bow extends Throwing{
    private final String name;
    private Random random = new Random();

    public Bow(int distance) {
        super(distance);
        this.name = "Bow";
    }

    @Override
    public int damage() {
        if (getDistance() > 10)
            return random.nextInt(20, 30);;
        return 10;
    }

    @Override
    public String toString() {
        return "Bow " + name +
                super.toString() ;
    }

    @Override
    public boolean block() {
        return false;
    }
}