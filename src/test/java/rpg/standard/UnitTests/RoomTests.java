package rpg.standard.UnitTests;

import org.junit.*;
import rpg.framework.Game;
import rpg.framework.RoomLayout;
import rpg.framework.Strategies.RoomLayoutStrategy;
import rpg.standard.GameImpl;
import rpg.standard.Rooms.*;
import rpg.standard.Rooms.RoomLayoutStrategies.NotRandomRoomLayout;
import rpg.standard.Rooms.RoomLayoutStrategies.RandomRoomLayout;
import rpg.standard.Versions.GameWithoutRandomization;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class RoomTests {

    private GameImpl game;

    private BattleRoom battleRoom;
    private BossRoom bossRoom;
    private EventRoom eventRoom;
    private HealRoom healRoom;
    private StartRoom startRoom;

    @Before
    public void setUp() {
        // Can switch between with or without randomization
        game = new GameImpl(new GameWithoutRandomization());
        battleRoom = new BattleRoom();
        bossRoom = new BossRoom();
        eventRoom = new EventRoom();
        healRoom = new HealRoom();
        startRoom = new StartRoom();
    }

    @Test
    public void testRoomTypes() {
        assertThat(battleRoom.getTypeString(), is("battle"));
        assertThat(bossRoom.getTypeString(), is("boss"));
        assertThat(eventRoom.getTypeString(), is("event"));
        assertThat(healRoom.getTypeString(), is("heal"));
        assertThat(startRoom.getTypeString(), is("start"));
    }

    @Test
    public void testRoomLayoutListGenerates() {
        // Get the room layout strategy already initialized in GameImpl
        RoomLayoutStrategy roomLayoutStrategy = game.getRoomLayoutStrategy();

        // Cast to NotRandomRoomLayout if needed
        NotRandomRoomLayout roomLayout = (NotRandomRoomLayout) roomLayoutStrategy;

        // Assert the size of routes
        assertThat(roomLayout.getRouteSize(1), is(3)); // Checks the size of the second route
        assertThat(roomLayout.getAmountOfRoutes(), is(3)); // Checks the total number of routes
    }

    @Test
    public void testRouteRouteIsFair() {

    }
}
