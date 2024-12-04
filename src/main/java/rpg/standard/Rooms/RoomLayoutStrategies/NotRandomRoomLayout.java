package rpg.standard.Rooms.RoomLayoutStrategies;

import rpg.framework.Game;
import rpg.framework.Room;
import rpg.framework.Strategies.RoomLayoutStrategy;
import rpg.standard.Rooms.BattleRoom;
import rpg.standard.Rooms.BossRoom;
import rpg.standard.Rooms.EventRoom;
import rpg.standard.Rooms.HealRoom;

import java.util.ArrayList;
import java.util.List;

public class NotRandomRoomLayout implements RoomLayoutStrategy {

    private List<List<Room>> routes;

    public void createWorld(Game game) {
        routes = new ArrayList<>();

        // Define each route explicitly
        List<Room> route1 = new ArrayList<>();
        route1.add(new BattleRoom());
        route1.add(new HealRoom());
        route1.add(new EventRoom());

        List<Room> route2 = new ArrayList<>();
        route2.add(new EventRoom());
        route2.add(new BattleRoom());
        route2.add(new HealRoom());

        List<Room> route3 = new ArrayList<>();
        route3.add(new HealRoom());
        route3.add(new BattleRoom());
        route3.add(new EventRoom());

        // Add routes to the world
        routes.add(route1);
        routes.add(route2);
        routes.add(route3);

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
