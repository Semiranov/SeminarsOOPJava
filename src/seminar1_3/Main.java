package seminar1_3;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Npc> darkSide = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randNum = random.nextInt(0, 4);
            if (randNum == 0) darkSide.add(new Peasant(darkSide));
            else if (randNum == 1) darkSide.add(new Sniper(darkSide));
            else if (randNum == 2) darkSide.add(new Outlaw(darkSide));
            else darkSide.add(new Magician(darkSide));
        }

        ArrayList<Npc> lightSide = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randNum = random.nextInt(0, 4);
            if (randNum == 0) lightSide.add(new Peasant(lightSide));
            else if (randNum == 1) lightSide.add(new Spearmen(lightSide));
            else if (randNum == 2) lightSide.add(new Crossbowmen(lightSide));
            else lightSide.add(new Monk(lightSide));
        }


        darkSide.forEach(System.out::println);
        System.out.println();
        lightSide.forEach(System.out::println);


    }


}
