package rpg.standard.Versions;

import rpg.framework.AbstractFactory;
import rpg.framework.Strategies.RoomLayoutStrategy;
import rpg.standard.Rooms.RoomLayoutStrategies.RandomRoomLayout;

public class GameWithRandomization implements AbstractFactory {

    public RoomLayoutStrategy roomLayoutStrategy() {
        return new RandomRoomLayout();
    }
}
