package seminar1_3;

import java.util.ArrayList;

public class Magician extends Npc {  //Колдун
    public Magician(ArrayList<Npc> group) {
        super(17, 12, 0, new int[]{-5, -5}, 30, 9,
                false, true, "Колдун");
        super.group = group;
    }

    @Override
    public void Step(ArrayList<Npc> group) {
        for (int i = 1; i < group.size(); i++) {
            Npc dying = group.get(0);
            int minHP = group.get(0).getHealth();
            if (group.get(i).getHealth() < minHP){
                minHP = group.get(i).getHealth();
                dying = group.get(i);
            }
            dying.setHealth(dying.getHealth()-getDamage()[0] );
        }

        for (Npc player : group) {
            if (player.getHealth() < player.getMaxHealth()) {
                player.setHealth(player.getHealth()-(getDamage()[1]-getDamage()[0])/2);

            }

        }

    }
}
