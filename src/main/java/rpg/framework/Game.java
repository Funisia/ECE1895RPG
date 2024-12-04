package rpg.framework;

public interface Game {
  // === Accessor methods ===================================

    public Position getPosition();

  // === Mutator methods ======================================

    public boolean moveRoom ();

    public void endTurn();
}
