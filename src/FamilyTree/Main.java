package FamilyTree;


public class Main {

    public static void main(String[] args) {
        Human vova = new Human("Владимир", 1990, 03, 15, "мужской");
        Human lila = new Human("Лилия", 1991, 12, 15, "женский");
        Human karina = new Human("Карина", 2017, 07, 14, "женский");
        Human zhena = new Human("Евгений", 2020, 07, 11, "мужской");
        Human luba = new Human("Любовь", 2020, 03, 28, "женский");
        Human kira = new Human("Кирилл", 2022, 03, 10, "мужской");
        Human sveta = new Human("Света", 2021, 05, 11, "женский");

        FamilyTree familyTree = new FamilyTree();
        familyTree.appendMather(lila,zhena);
        familyTree.appendMather(lila, karina);
        familyTree.appendMather(lila, luba);
        familyTree.appendMather(lila, kira);
        familyTree.appendMather(lila, sveta);
        familyTree.appendMather(vova,zhena);
        familyTree.appendMather(vova, karina);
        familyTree.appendMather(vova, luba);
        familyTree.appendMather(vova, kira);
        familyTree.appendMather(vova, sveta);


        new  Research(familyTree).getSon(lila);
        new  Research(familyTree).getDaughter(vova);
        new  Research(familyTree).getSon(vova);
        new  Research(familyTree).getMom(karina);
        new  Research(familyTree).getDad(zhena);
        new  Research(familyTree).getParents(sveta);






    }
}