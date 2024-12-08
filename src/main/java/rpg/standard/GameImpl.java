package rpg.standard;

import rpg.framework.*;
import rpg.framework.Class;
import rpg.framework.Strategies.RoomLayoutStrategy;

import java.util.List;

public class GameImpl implements Game {

    // Array to hold player and enemies in rooms
    private Enemy[][] EnemygitArray = new Enemy[3][3];
    private Class[][] ClassArray = new Class[5][1];
    // Strategies
    private RoomLayoutStrategy roomLayoutStrategy;
    // Map Initializations
    private List<List<Room>> routes;
    private int currentRoute;
    private int currentRoomIndex;
    private Room currentRoom;

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

    public RoomLayoutStrategy getRoomLayoutStrategy() {
        return this.roomLayoutStrategy;
    }


    // Get the current position in the current route
    public Position getPosition() {
        Room currentRoom = routes.get(currentRoute).get(currentRoomIndex);
        return new Position(currentRoute, currentRoomIndex, currentRoom);
    }

    // Returns a specific route
    public List<Room> getRoute(int routeIndex) {
        return this.roomLayoutStrategy.getRoute(routeIndex) ;
    }

    // Returns the Route List generated at start of game
    public List<List<Room>> getRouteList() {
        return this.roomLayoutStrategy.getRouteList();
    }

    public Room getCurrentRoom (List<List<Room>> routeNumber, List<Room> routeIndex) {
        return null;
    }

    // Move to the next room in the current route
    public boolean moveRoom() {
        if (currentRoomIndex >= routes.get(currentRoute).size() - 1) {
            return false; // No more rooms in the route
        }

        // Add moveRoom logic

        return true;
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


    public void attackUnit(Position unitToAttack) {

    }
}
