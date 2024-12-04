package rpg.standard;

import rpg.framework.*;
import rpg.framework.Strategies.RoomLayoutStrategy;

import java.util.List;

public class GameImpl implements Game {
    private RoomLayoutStrategy roomLayoutStrategy;
    private List<List<Room>> routes;
    private int currentRoute;
    private int currentRoomIndex;

    public GameImpl(AbstractFactory version) {
        this.roomLayoutStrategy = version.roomLayoutStrategy();
        createRoutes(); // Initialize the routes
    }

    // Initialize routes using the strategy
    private void createRoutes() {
        roomLayoutStrategy.createWorld(this);
        this.currentRoute = 0;
        this.currentRoomIndex = 0;
    }

    // Get the current position in the current route
    public Position getPosition() {
        Room currentRoom = routes.get(currentRoute).get(currentRoomIndex);
        return new Position(currentRoute, currentRoomIndex, currentRoom);
    }

    // Move to the next room in the current route
    public boolean moveRoom() {
        if (currentRoomIndex < routes.get(currentRoute).size() - 1) {
            currentRoomIndex++;
            return true; // Successfully moved
        }
        return false; // No more rooms in the route
    }

    // Switch to another route
    public boolean switchRoute(int routeIndex) {
        if (routeIndex >= 0 && routeIndex < routes.size()) {
            currentRoute = routeIndex;
            currentRoomIndex = 0; // Reset to the start of the new route
            return true;
        }
        return false; // Invalid route index
    }


    // End the player's turn (placeholder for future logic)
    public void endTurn() {
        // Add turn-related logic here
    }
}
