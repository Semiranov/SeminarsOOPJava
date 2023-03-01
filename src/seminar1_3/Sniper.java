package seminar1_3;

import java.util.ArrayList;

public class Sniper extends Npc { //Снайпер
    public Sniper(ArrayList<Npc> group) {
        super(12, 10, 32, new int[]{8,10}, 15, 9,
                false, false, "Снайпер");
        super.group = group;
    }

    @Override
    public void Step(ArrayList<Npc> group) {

    }
}
