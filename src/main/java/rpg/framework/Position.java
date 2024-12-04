package rpg.framework;

public class Position {
    private int routeIndex;
    private int roomIndex;
    private Room room;

    public Position(int routeIndex, int roomIndex, Room room) {
        this.routeIndex = routeIndex;
        this.roomIndex = roomIndex;
        this.room = room;
    }

    public int getRouteIndex() {
        return routeIndex;
    }

    public int getRoomIndex() {
        return roomIndex;
    }

    public Room getRoom() {
        return room;
    }

    public String toString() {
        return "Route: " + routeIndex + ", Room: " + roomIndex + ", Room Type: " + room.getTypeString();
    }
}

