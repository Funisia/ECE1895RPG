package rpg.standard.Rooms;

import rpg.framework.*;
import static rpg.framework.GameConstants.START;

public class StartRoom implements Room {

    private static final String type = START;

    public String getTypeString() {
        return type;
    }
}
