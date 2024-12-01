package rpg.standard;

import rpg.framework.*;
import rpg.framework.Strategies.RoomLayoutStrategy;

public class GameImpl implements Game {
    private RoomLayoutStrategy roomLayoutStrategy;

    public GameImpl(AbstractFactory version) {
        this.roomLayoutStrategy = version.roomLayoutStrategy();
    }

    public void getPosition() {

    }

    public boolean moveRoom() {
        return false;
    }

    public void endTurn() {

    }

    public void createRoom() {

    }

    public void getRoom() {

    }
}
