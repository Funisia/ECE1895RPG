package rpg.framework;

import rpg.framework.Strategies.RoomLayoutStrategy;

public interface Game {
  // === Accessor methods ===================================

    public Position getPosition();

  // === Mutator methods ======================================

    public boolean moveRoom ();

    public void endTurn();

}
