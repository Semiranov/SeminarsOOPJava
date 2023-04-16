package seminar4;

public class Bow extends Throwing {
    private String name;

    public Bow(int distance, String name) {
        super(distance);
        this.name = "Bow";
    }

    @Override
    public int damage() {
        return 10;
    }

    @Override
    public String toString() {
        return "Bow{" +
                "name= '" + name +
                super.toString() +
                '}';
    }
}
