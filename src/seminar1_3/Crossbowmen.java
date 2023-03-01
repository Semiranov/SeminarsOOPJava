package seminar1_3;

import java.util.ArrayList;

public class Crossbowmen extends Npc { //Арбалетчик
    public Crossbowmen(ArrayList<Npc> group) {
        super(6, 3, 16, new int[]{2,3}, 10, 4,
                false, false, "Арбалетчик");
        super.group = group;
    }

    @Override
    public void Step(ArrayList<Npc> group) {

    }
}
