package rpg.standard.Rooms.RoomLayoutStrategies;

import rpg.framework.Game;
import rpg.framework.Room;
import rpg.framework.RoomLayout;
import rpg.framework.Strategies.RoomLayoutStrategy;
import rpg.standard.Rooms.BattleRoom;
import rpg.standard.Rooms.EventRoom;
import rpg.standard.Rooms.HealRoom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomRoomLayout implements RoomLayoutStrategy {

    private List<List<Room>> routes;

    public void createWorld(Game game) {
        int numberOfRoutes = 3;
        int numberOfRooms = 3;
        routes = new ArrayList<>();
        for (int i = 0; i < numberOfRoutes; i++) {
            List<Room> route = new ArrayList<>();
            routes.add(route);
            generateRoute(route, numberOfRooms);
        }

    }

    public void generateRoute(List<Room> route, int numberOfRooms) {
        Random rand = new Random();
        String[] roomTypes = {"battle", "event", "heal"};
        for (int i = 0; i < numberOfRooms; i++) {
            String type = roomTypes[rand.nextInt(roomTypes.length)];
            switch (type) {
                case "battle":
                    route.add(new BattleRoom());
                    break;
                case "event":
                    route.add(new EventRoom());
                    break;
                case "heal":
                    route.add(new HealRoom());
            }
        }
    }

    public List<Room> getRoute(int routeIndex) {
        return routes.get(routeIndex);
    }

    public List<List<Room>> getRouteList() {
        return routes;
    }

    public int getRouteSize(int routeIndex) {
        return routes.get(routeIndex).size();
    }

    public int getAmountOfRoutes() {
        return routes.size();
    }

}
