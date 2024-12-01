package rpg.standard.UnitTests;

import org.junit.*;
import rpg.framework.RoomLayout;
import rpg.standard.Rooms.*;
import rpg.standard.Rooms.RoomLayoutStrategies.RandomRoomLayout;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class RoomTests {

    private BattleRoom battleRoom;
    private BossRoom bossRoom;
    private EventRoom eventRoom;
    private HealRoom healRoom;
    private StartRoom startRoom;
    private RoomLayout roomLayout;

    @Before
    public void setUp() {
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
        // Generates routes
        //roomLayout = new RandomRoomLayout(3, 3);

        // Asserts amount & size of routes
//        assertThat(roomLayout.getRouteSize(1), is(3));
//        assertThat(roomLayout.getAmountOfRoutes(), is(3));
//        assertThat(roomLayout.getBossRoom(), is (true));
    }

    @Test
    public void testRouteRouteIsFair() {

    }
}
