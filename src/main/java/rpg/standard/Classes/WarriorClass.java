package rpg.standard.Classes;

import rpg.framework.Class;

import static rpg.framework.GameConstants.*;

public class WarriorClass implements Class {

    private int Defense = 20;
    private int Attack = 20;
    private int AttackCount = 1;


    public String getOwner() {
        return USER;
    }

    public String getTypeString() {
        return WARRIOR;
    }

    public int getDefense() {
        return Defense;
    }

    public int getAttack() {
        return Attack;
    }

    public String getAttackType() {
        return PHYSICAL;
    }

    public int getAttackCount() {
        return AttackCount;
    }
}
