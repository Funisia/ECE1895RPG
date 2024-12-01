package rpg.standard.Rooms;

import rpg.framework.*;
import static rpg.framework.GameConstants.HEAL;

public class HealRoom implements Room {

    private static final String type = HEAL;

    public String getTypeString() {
        return type;
    }
}
