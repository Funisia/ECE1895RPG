package rpg.framework.Strategies;

import rpg.framework.Game;
import rpg.framework.Room;

import java.util.List;

public interface RoomLayoutStrategy {
    public void createWorld (Game game);

    public List<Room> getRoute(int routeIndex);

}
