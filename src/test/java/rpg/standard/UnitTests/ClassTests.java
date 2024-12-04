package rpg.standard.UnitTests;

import org.junit.*;
import rpg.framework.RoomLayout;
import rpg.standard.Classes.*;
import rpg.standard.Rooms.*;
import rpg.standard.Rooms.RoomLayoutStrategies.RandomRoomLayout;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ClassTests {

    private RangerClass ranger;
    private WarriorClass warrior;
    private WizardClass wizard;

    @Before
    public void setUp() {
        ranger = new RangerClass();
        warrior = new WarriorClass();
        wizard = new WizardClass();
    }

    @Test
    public void testRangerInitializations() {
        assertThat(ranger.getTypeString(), is("ranger"));
        assertThat(ranger.getAttack(), is(25));
        assertThat(ranger.getDefense(), is(15));
        assertThat(ranger.getAttackCount(), is(1));
    }

    @Test
    public void testWarriorInitializations() {
        assertThat(warrior.getTypeString(), is("warrior"));
        assertThat(warrior.getAttack(), is(20));
        assertThat(warrior.getDefense(), is(20));
        assertThat(warrior.getAttackCount(), is(1));
    }

    @Test
    public void testWizardInitializations() {
        assertThat(wizard.getTypeString(), is("wizard"));
        assertThat(wizard.getAttack(), is(30));
        assertThat(wizard.getDefense(), is(10));
        assertThat(wizard.getAttackCount(), is(1));
    }
}
