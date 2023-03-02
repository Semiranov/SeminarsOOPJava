package FamilyTree;

import java.util.ArrayList;

public class FamilyTree {
    ArrayList<Communication> tree = new ArrayList<>();

    public ArrayList<Communication> getTree() {
        return tree;
    }

    public void appendMather(Human human, Human human2) {//метод добавления мамы для обьекта
        tree.add(new Communication(human, Relationship.MATHER, human2));
        if (human2.getGender() == Relationship.MAN) {
            tree.add(new Communication(human2, Relationship.SON, human));
        } else tree.add(new Communication(human2, Relationship.DAUGHTER, human));
    }

    public void appendFather(Human human, Human human2) {//метод добавления папы для обьекта
        tree.add(new Communication(human, Relationship.FATHER, human2));
        if (human2.getGender() == Relationship.MAN) {
            tree.add(new Communication(human2, Relationship.SON, human));
        } else tree.add(new Communication(human2, Relationship.DAUGHTER, human));
    }

    @Override
    public String toString() {
        return "FamilyTree{" +
                "tree=" + tree +
                '}';
    }
}
