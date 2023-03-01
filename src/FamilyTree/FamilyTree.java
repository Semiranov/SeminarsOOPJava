package FamilyTree;

import java.util.ArrayList;

public class FamilyTree {
    ArrayList<Communication> tree = new ArrayList<>();

    public ArrayList<Communication> getTree() {
        return tree;
    }

    public void appendMather(Human human, Human human2) {
        tree.add(new Communication(human, Relationship.mather, human2));
        if (human2.getGender().equalsIgnoreCase("мужской")) {
            tree.add(new Communication(human2, Relationship.son, human));
        } else tree.add(new Communication(human2, Relationship.daughter, human));
    }

    public void appendFather(Human human, Human human2) {
        tree.add(new Communication(human, Relationship.father, human2));
        if (human2.getGender().equalsIgnoreCase("мужской")) {
            tree.add(new Communication(human2, Relationship.son, human));
        } else tree.add(new Communication(human2, Relationship.daughter, human));
    }

    @Override
    public String toString() {
        return "FamilyTree{" +
                "tree=" + tree +
                '}';
    }
}
