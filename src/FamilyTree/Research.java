package FamilyTree;

import java.util.ArrayList;

public class Research {
    private ArrayList<Communication> tree;

    public Research(FamilyTree tree) {
        this.tree = tree.getTree();
    }

    public ArrayList getSon(Human human) { //поиск сына
        ArrayList rez = new ArrayList<Human>();
        for (var i : tree) {
            if (i.getPerson1() == human && (i.getRelation() == Relationship.mather || i.getRelation() == Relationship.father) &&
                    i.getPerson2().getGender().equalsIgnoreCase("мужской"))
                rez.add(i.getPerson2());
        }
        System.out.println(human + ": Сын" + rez);
        return rez;
    }

    public ArrayList getDaughter(Human human) { //поиск дочери
        ArrayList rez = new ArrayList<Human>();
        for (var i : tree) {
            if (i.getPerson1() == human && (i.getRelation() == Relationship.mather || i.getRelation() == Relationship.father) &&
                    i.getPerson2().getGender().equalsIgnoreCase("женский"))
                rez.add(i.getPerson2());
        }
        System.out.println(human + ": Дочь" + rez);
        return rez;
    }

    public ArrayList getСhild(Human human) { //поиск ребенка
        ArrayList rez = new ArrayList<Human>();
        for (var i : tree) {
            if (i.getPerson1() == human && (i.getRelation() == Relationship.mather || i.getRelation() == Relationship.father))
                rez.add(i.getPerson2());
        }
        System.out.println(human + ": Ребенок" + rez);
        return rez;
    }

    public ArrayList getMom(Human human) { //поиск мамы
        ArrayList rez = new ArrayList<Human>();
        for (var i : tree) {
            if (i.getPerson1() == human && (i.getRelation() == Relationship.daughter || i.getRelation() == Relationship.son) &&
            i.getPerson2().getGender().equalsIgnoreCase("женский"))
                rez.add(i.getPerson2());
        }
        System.out.println(human + ": Мама" + rez);
        return rez;
    }

    public ArrayList getDad(Human human) { //поиск папы
        ArrayList rez = new ArrayList<Human>();
        for (var i : tree) {
            if (i.getPerson1() == human && (i.getRelation() == Relationship.daughter || i.getRelation() == Relationship.son) &&
            i.getPerson2().getGender().equalsIgnoreCase("мужской"))
                rez.add(i.getPerson2());
        }
        System.out.println(human + ": Папа" + rez);
        return rez;
    }

    public ArrayList getParents(Human human) { //поиск родителей
        ArrayList rez = new ArrayList<Human>();
        for (var i : tree) {
            if (i.getPerson1() == human && (i.getRelation() == Relationship.daughter || i.getRelation() == Relationship.son))
                rez.add(i.getPerson2());
        }
        System.out.println(human + ": Родители" + rez);
        return rez;
    }

}
