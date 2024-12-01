package rpg.framework;

import rpg.framework.Strategies.RoomLayoutStrategy;

public interface AbstractFactory {
    RoomLayoutStrategy roomLayoutStrategy();
}
