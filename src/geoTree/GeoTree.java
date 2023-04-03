package geoTree;

import java.util.ArrayList;

public class GeoTree {
    ArrayList<Communication> tree = new ArrayList<>();

    public ArrayList<Communication> getTree() {
        return tree;
    }



    public void append(Person person1, Relationship relation, Person person2) {
        if (relation == Relationship.MATHER) {
            tree.add(new Communication(person1, relation, person2));
            if (person2.getGender() == Gender.Man) {
                tree.add(new Communication(person2, Relationship.SON, person1));
            } else tree.add(new Communication(person2, Relationship.DAUGHTER, person1));
        }

        if (relation == Relationship.FATHER) {
            tree.add(new Communication(person1, relation, person2));
            if (person2.getGender() == Gender.Man) {
                tree.add(new Communication(person2, Relationship.SON, person1));
            } else tree.add(new Communication(person2, Relationship.DAUGHTER, person1));
        }


    }

    @Override
    public String toString() {
        return tree.toString();
    }
}
