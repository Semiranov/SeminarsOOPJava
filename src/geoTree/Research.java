package geoTree;

import java.util.ArrayList;

public class Research {
    private ArrayList<Communication> tree;

    public Research(GeoTreeImp tree) {
        this.tree = tree.getTree();
    }

    public void getChildren(Person person){
        ArrayList rezult = new ArrayList<Person>();
        for (var i : tree) {
            if (i.getPerson1() == person && (i.getRelation() == Relationship.MATHER ||
                    i.getRelation() == Relationship.FATHER)){
                rezult.add(i.getPerson2());
            }

        }
        System.out.println(rezult);
    }

    public void getParents(Person person){
        ArrayList rezult = new ArrayList<Person>();
        for (var i : tree) {
            if (i.getPerson1() == person && (i.getRelation() == Relationship.SON ||
                    i.getRelation() == Relationship.DAUGHTER)){
                rezult.add(i.getPerson2());
            }

        }
        System.out.println(rezult);
    }

}
