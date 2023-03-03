package FamilyTree;

public class Communication {
    private People person1;
    private People person2;
    private Relationship relation;

    public Communication(People person1, Relationship relation, People person2) {
        this.person1 = person1;
        this.person2 = person2;
        this.relation = relation;
    }

    public People getPerson1() {
        return person1;
    }

    public People getPerson2() {
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
