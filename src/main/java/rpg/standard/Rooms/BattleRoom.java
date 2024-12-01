package rpg.standard.Rooms;

import rpg.framework.*;
import static rpg.framework.GameConstants.BATTLE;

public class BattleRoom implements Room {

    private static final String type = BATTLE;

    public String getTypeString() {
        return type;
    }
}
