package seminar4;

public abstract class Throwing implements Weapon{
    private int distance;


    public Throwing(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }
    @Override
    public  String toString(){
        return "Trowing" +
                " distance: " + distance +
                " damage: " + damage();
    }

    public abstract boolean block();
}
