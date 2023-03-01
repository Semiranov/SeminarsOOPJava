package FamilyTree;

public class Communication {
    private Human person1;
    private Human person2;
    private Relationship relation;

    public Communication(Human person1, Relationship relation, Human person2) {
        this.person1 = person1;
        this.person2 = person2;
        this.relation = relation;
    }

    public Human getPerson1() {
        return person1;
    }

    public Human getPerson2() {
        return person2;
    }

    public Relationship getRelation() {
        return relation;
    }

    @Override
    public String toString() {
        return person1 +
                " " + relation +
                " " + person2;
    }
}
