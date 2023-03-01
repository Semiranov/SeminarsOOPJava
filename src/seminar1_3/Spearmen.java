package seminar1_3;

import java.util.ArrayList;

public class Spearmen extends Npc { //Копейщик
    public Spearmen(ArrayList<Npc> group) {
        super(4, 5, 0, new int[]{1,3}, 10, 4,
                false, false, "Копейщик");
        super.group = group;
    }

    @Override
    public void Step(ArrayList<Npc> group) {

    }
}
