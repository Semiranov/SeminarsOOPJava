package Seminar1_1;

public class Relations {

    private Status status;
    private Person person;

    public Relations(Status status, Person person) {
        this.person = person;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Relations{" +
                "status=" + status +
                ", person=" + person +
                '}';
    }
}
