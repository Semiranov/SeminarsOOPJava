package FamilyTree;
//1. Реализовать, с учетом ооп подхода, приложение Для проведения исследований с генеалогическим древом.
//2. Обеспечить переход от использования явных классов в сторону использования абстрактных типов.


public class Main {

    public static void main(String[] args) {
        Human vova = new Human("Владимир", 1990, 03, 15, Relationship.MAN);
        Human lila = new Human("Лилия", 1991, 12, 15, Relationship.WOMAN);
        Human karina = new Human("Карина", 2017, 07, 14, Relationship.WOMAN);
        Human zhena = new Human("Евгений", 2020, 07, 11, Relationship.MAN);
        Human luba = new Human("Любовь", 2020, 03, 28, Relationship.WOMAN);
        Human kira = new Human("Кирилл", 2022, 03, 10, Relationship.MAN);
        Human sveta = new Human("Света", 2021, 05, 11, Relationship.WOMAN);

        People bars = new Cat("Барсик", vova);

        FamilyTree familyTree = new FamilyTree();
        familyTree.append(lila, Relationship.MATHER, zhena);
        familyTree.append(lila, Relationship.MATHER, karina);
        familyTree.append(lila, Relationship.MATHER, luba);
        familyTree.append(lila, Relationship.MATHER, kira);
        familyTree.append(lila, Relationship.MATHER, sveta);

        familyTree.append(vova, Relationship.FATHER, zhena);
        familyTree.append(vova, Relationship.FATHER, karina);
        familyTree.append(vova, Relationship.FATHER, luba);
        familyTree.append(vova, Relationship.FATHER, kira);
        familyTree.append(vova, Relationship.FATHER, sveta);

        familyTree.append(lila, Relationship.OWNER, bars);


        new Research(familyTree).getSon(lila);
        new Research(familyTree).getDaughter(vova);
        new Research(familyTree).getSon(vova);
        new Research(familyTree).getMom(karina);
        new Research(familyTree).getDad(zhena);
        new Research(familyTree).getParents(sveta);
        new Research(familyTree).getСhild(lila);
        new Research(familyTree).getOwner(bars);


    }
}