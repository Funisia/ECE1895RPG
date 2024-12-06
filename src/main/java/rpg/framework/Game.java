package rpg.framework;

import rpg.framework.Strategies.RoomLayoutStrategy;

import java.util.List;

public interface Game {
  // === Accessor methods ===================================

    public Position getPosition();

    public Room getCurrentRoom(List<List<Room>> routeNumber, List<Room> routeIndex);

    // === Mutator methods ======================================

    public boolean moveRoom ();

    public void endTurn();

    public void attackUnit(Position unitToAttack);


}
