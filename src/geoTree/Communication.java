package geoTree;

public class Communication {
    private Person person1;
    private Person person2;
    private Relationship relation;

    public Communication(Person person1, Relationship relation, Person person2) {
        this.person1 = person1;
        this.person2 = person2;
        this.relation = relation;
    }

    public Person getPerson1() {
        return person1;
    }

    public Person getPerson2() {
        return person2;
    }

    public Relationship getRelation() {
        return relation;
    }

    @Override
    public String toString() {
        return person1 +
                ", в отношениях с " + person2 +
                ", как " + relation;
    }
}
