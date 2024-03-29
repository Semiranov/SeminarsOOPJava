package FamilyTree;

import java.util.ArrayList;

public class FamilyTree{
    ArrayList<Communication> tree = new ArrayList<>();

    public ArrayList<Communication> getTree() {
        return tree;
    }


    public void append(People human, Relationship relation, People human2) {//метод добавления связи
        if (relation == Relationship.MATHER) { //проверка для мамы
            tree.add(new Communication(human, relation, human2));
            if (human2.getGender() == Relationship.MAN) {
                tree.add(new Communication(human2, Relationship.SON, human));
            } else tree.add(new Communication(human2, Relationship.DAUGHTER, human));
        } else if (relation == Relationship.FATHER) { //проверка для папы
            tree.add(new Communication(human, relation, human2));
            if (human2.getGender() == Relationship.MAN) {
                tree.add(new Communication(human2, Relationship.SON, human));
            } else tree.add(new Communication(human2, Relationship.DAUGHTER, human));
        } else if (relation == Relationship.OWNER) { //проверка для хозяина]
            tree.add(new Communication(human, relation, human2));

        }
    }
    

    @Override
    public String toString() {
        return "FamilyTree{" +
                "tree=" + tree +
                '}';
    }

}
