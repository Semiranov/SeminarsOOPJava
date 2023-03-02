package FamilyTree;


public class Main {

    public static void main(String[] args) {
        Human vova = new Human("Владимир", 1990, 03, 15, Relationship.MAN);
        Human lila = new Human("Лилия", 1991, 12, 15, Relationship.WOMAN);
        Human karina = new Human("Карина", 2017, 07, 14, Relationship.WOMAN);
        Human zhena = new Human("Евгений", 2020, 07, 11, Relationship.MAN);
        Human luba = new Human("Любовь", 2020, 03, 28, Relationship.WOMAN);
        Human kira = new Human("Кирилл", 2022, 03, 10, Relationship.MAN);
        Human sveta = new Human("Света", 2021, 05, 11, Relationship.WOMAN);

        FamilyTree familyTree = new FamilyTree();
        familyTree.appendMather(lila,zhena);
        familyTree.appendMather(lila, karina);
        familyTree.appendMather(lila, luba);
        familyTree.appendMather(lila, kira);
        familyTree.appendMather(lila, sveta);
        familyTree.appendFather(vova,zhena);
        familyTree.appendFather(vova, karina);
        familyTree.appendFather(vova, luba);
        familyTree.appendFather(vova, kira);
        familyTree.appendFather(vova, sveta);



        new  Research(familyTree).getSon(lila);
        new  Research(familyTree).getDaughter(vova);
        new  Research(familyTree).getSon(vova);
        new  Research(familyTree).getMom(karina);
        new  Research(familyTree).getDad(zhena);
        new  Research(familyTree).getParents(sveta);
        new  Research(familyTree).getСhild(lila);






    }
}