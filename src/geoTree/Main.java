package geoTree;

public class Main {
    public static void main(String[] args) {
        Person vladimir = new Person("Владимир", 33, Gender.Man);
        Person liliya = new Person("Лилия", 31, Gender.Woman);
        Person karina = new Person("Карина", 5, Gender.Woman);
        Person zhenya = new Person("Евгений", 2, Gender.Man);

        GeoTreeImp geoTree = new GeoTreeImp();

        geoTree.append(vladimir, Relationship.FATHER, karina);
        geoTree.append(vladimir, Relationship.FATHER, zhenya);
        geoTree.append(liliya, Relationship.MATHER, karina);
        geoTree.append(liliya, Relationship.MATHER, zhenya);

        System.out.println(geoTree);

        new Research(geoTree).getChildren(liliya);
        new Research(geoTree).getParents(karina);
    }
}
