package rpg.framework;

public interface Game {
  // === Accessor methods ===================================

    public void getPosition();

  // === Mutator methods ======================================

    public boolean moveRoom ();

    public void endTurn();
}
