package rpg.standard.Classes;

import rpg.framework.Class;

import static rpg.framework.GameConstants.*;

public class RangerClass implements Class {

    private int Defense = 15;
    private int Attack = 25;
    private int AttackCount = 1;


    public String getOwner() {
        return USER;
    }

    public String getTypeString() {
        return RANGER;
    }

    public int getDefense() {
        return Defense;
    }

    public int getAttack() {
        return Attack;
    }

    public String getAttackType() {
        return RANGE;
    }

    public int getAttackCount() {
        return AttackCount;
    }
}
