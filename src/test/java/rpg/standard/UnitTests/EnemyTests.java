package rpg.standard.UnitTests;

import org.junit.*;
import rpg.framework.RoomLayout;
import rpg.standard.Classes.*;
import rpg.standard.Enemies.*;
import rpg.standard.GameImpl;
import rpg.standard.Rooms.*;
import rpg.standard.Rooms.RoomLayoutStrategies.RandomRoomLayout;
import rpg.standard.Versions.GameWithoutRandomization;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class EnemyTests {

    private GameImpl game;
    private Bat bat;
    private Skeleton skeleton;
    private Slime slime;

    @Before
    public void setUp() {
        game = new GameImpl(new GameWithoutRandomization());
        bat = new Bat();
        skeleton = new Skeleton();
        slime = new Slime();
    }

    @Test
    public void testBatInitializations() {
        assertThat(bat.getTypeString(), is("bat"));
        assertThat(bat.getAttack(), is(10));
        assertThat(bat.getDefense(), is(5));
        assertThat(bat.getAttackCount(), is(1));
    }

    @Test
    public void testSkeletonInitializations() {
        assertThat(skeleton.getTypeString(), is("skeleton"));
        assertThat(skeleton.getAttack(), is(5));
        assertThat(skeleton.getDefense(), is(15));
        assertThat(skeleton.getAttackCount(), is(1));
    }

    @Test
    public void testSlimeInitializations() {
        assertThat(slime.getTypeString(), is("slime"));
        assertThat(slime.getAttack(), is(5));
        assertThat(slime.getDefense(), is(5));
        assertThat(slime.getAttackCount(), is(2));
    }
}
