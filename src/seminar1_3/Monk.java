package seminar1_3;

import java.util.ArrayList;

public class Monk extends Npc{ //Монах
    public Monk(ArrayList<Npc> group) {
        super(12, 7, 0, new int[]{-4,-4}, 30, 5,
                false, true, "Монах");
        super.group = group;
    }

    @Override
    public void Step(ArrayList<Npc> group) {

    }
}
