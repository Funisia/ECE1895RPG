package rpg.standard.Enemies;

import rpg.framework.Enemy;

import static rpg.framework.GameConstants.*;

public class Bat implements Enemy {

    private int Defense = 5;
    private int Attack = 10;
    private int AttackCount = 1;

    public String getOwner() {
        return ENEMY;
    }

    public String getTypeString() {
        return BAT;
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
