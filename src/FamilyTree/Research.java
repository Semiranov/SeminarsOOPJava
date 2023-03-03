package FamilyTree;

import java.util.ArrayList;

public class Research {
    private ArrayList<Communication> tree;

    public Research(FamilyTree tree) {
        this.tree = tree.getTree();
    }

    public void getSon(Human human) { //поиск сына
        ArrayList rez = new ArrayList<Human>();
        for (var i : tree) {
            if (i.getPerson1() == human && (i.getRelation() == Relationship.MATHER || i.getRelation() == Relationship.FATHER) &&
                    i.getPerson2().getGender() == Relationship.MAN)
                rez.add(i.getPerson2());
        }
        System.out.println(human + ": Сын" + rez);
    }

    public void getDaughter(Human human) { //поиск дочери
        ArrayList rez = new ArrayList<Human>();
        for (var i : tree) {
            if (i.getPerson1() == human && (i.getRelation() == Relationship.MATHER || i.getRelation() == Relationship.FATHER) &&
                    i.getPerson2().getGender() == Relationship.WOMAN)
                rez.add(i.getPerson2());
        }
        System.out.println(human + ": Дочь" + rez);
    }

    public void getСhild(Human human) { //поиск ребенка
        ArrayList rez = new ArrayList<Human>();
        for (var i : tree) {
            if (i.getPerson1() == human && (i.getRelation() == Relationship.MATHER || i.getRelation() == Relationship.FATHER))
                rez.add(i.getPerson2());
        }
        System.out.println(human + ": Ребенок" + rez);
    }

    public void getMom(Human human) { //поиск мамы
        ArrayList rez = new ArrayList<Human>();
        for (var i : tree) {
            if (i.getPerson1() == human && (i.getRelation() == Relationship.DAUGHTER || i.getRelation() == Relationship.SON) &&
                    i.getPerson2().getGender() == Relationship.WOMAN)
                rez.add(i.getPerson2());
        }
        System.out.println(human + ": Мама" + rez);
    }

    public void getDad(Human human) { //поиск папы
        ArrayList rez = new ArrayList<Human>();
        for (var i : tree) {
            if (i.getPerson1() == human && (i.getRelation() == Relationship.DAUGHTER || i.getRelation() == Relationship.SON) &&
                    i.getPerson2().getGender() == Relationship.MAN)
                rez.add(i.getPerson2());
        }
        System.out.println(human + ": Папа" + rez);
    }

    public void getParents(Human human) { //поиск родителей
        ArrayList rez = new ArrayList<Human>();
        for (var i : tree) {
            if (i.getPerson1() == human && (i.getRelation() == Relationship.DAUGHTER || i.getRelation() == Relationship.SON))
                rez.add(i.getPerson2());
        }
        System.out.println(human + ": Родители" + rez);
    }

    public void getOwner(People human) { //поиск хозяина
        ArrayList rez = new ArrayList<People>();
        for (var i : tree) {
            if (i.getPerson2() == human && i.getRelation() == Relationship.OWNER)
                rez.add(i.getPerson1());
        }
        System.out.println(human + ": Хозяин" + rez);
    }

}
