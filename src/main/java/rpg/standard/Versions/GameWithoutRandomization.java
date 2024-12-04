package rpg.standard.Versions;

import rpg.framework.AbstractFactory;
import rpg.framework.Strategies.RoomLayoutStrategy;
import rpg.standard.Rooms.RoomLayoutStrategies.NotRandomRoomLayout;

public class GameWithoutRandomization implements AbstractFactory {

    public RoomLayoutStrategy roomLayoutStrategy() {
        return new NotRandomRoomLayout();
    }
}
