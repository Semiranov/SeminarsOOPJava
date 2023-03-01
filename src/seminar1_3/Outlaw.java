package seminar1_3;

import java.util.ArrayList;

public class Outlaw extends Npc { //Разбойник
    public Outlaw(ArrayList<Npc> group) {
        super(8, 3, 0, new int[]{2,4}, 10, 6,
                false, false, "Разбойник");
        super.group = group;
    }

    @Override
    public void Step(ArrayList<Npc> group) {

    }
}
