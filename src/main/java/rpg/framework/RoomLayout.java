package rpg.framework;

import java.util.List;

public interface RoomLayout {

    public void generateRoute (List<Room> route, int numberOfRooms);

    public List<Room> getRoute(int RouteIndex);

    public int getRouteSize(int RouteIndex);

    public int getAmountOfRoutes ();


}
