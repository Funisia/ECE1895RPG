package rpg.standard.Rooms;

import rpg.framework.*;
import static rpg.framework.GameConstants.BOSS;

public class BossRoom implements Room {

    private static final String type = BOSS;

    public String getTypeString() {
        return type;
    }
}
