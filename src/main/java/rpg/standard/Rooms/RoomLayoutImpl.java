package rpg.standard.Rooms;

import rpg.framework.Room;
import rpg.framework.RoomLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RoomLayoutImpl implements RoomLayout {

    private List<List<Room>> routes;
    private Room bossRoom;

    public RoomLayoutImpl(int numberOfRoutes, int numberOfRooms) {
        routes = new ArrayList<>();
        for (int i = 0; i < numberOfRoutes; i++) {
            List<Room> route = new ArrayList<>();
            routes.add(route);
            generateRoute(route, numberOfRooms);
        }

        // Create a single boss room
        bossRoom = new BossRoom();
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

    public int getRouteSize(int routeIndex) {
        return routes.get(routeIndex).size();
    }

    public int getAmountOfRoutes() {
        return routes.size();
    }

    public boolean getBossRoom() {
        return bossRoom != null;
    }
}
