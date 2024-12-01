package rpg.standard.Rooms;

import rpg.framework.*;
import static rpg.framework.GameConstants.EVENT;

public class EventRoom implements Room {

    private static final String type = EVENT;

    public String getTypeString() {
        return type;
    }
}
