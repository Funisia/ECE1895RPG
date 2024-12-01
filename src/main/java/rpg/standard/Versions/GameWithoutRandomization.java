package rpg.standard.Versions;

import rpg.framework.AbstractFactory;
import rpg.framework.Strategies.RoomLayoutStrategy;

public class GameWithoutRandomization implements AbstractFactory {
    public RoomLayoutStrategy roomLayoutStrategy() {
        return null;
    }
}
