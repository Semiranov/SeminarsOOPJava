package seminar1_3;

import java.util.ArrayList;

public class Peasant extends Npc { //Крестьянин

    public Peasant(ArrayList<Npc> group) {
        super(1, 1, 0, new int[]{1,1}, 1, 3,
                true, false, "Крестьянин");
        super.group = group;
    }

    @Override
    public void Step(ArrayList<Npc> group) {

    }
}
