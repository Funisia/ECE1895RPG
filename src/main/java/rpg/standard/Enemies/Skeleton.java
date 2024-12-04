package rpg.standard.Enemies;

import rpg.framework.Enemy;

import static rpg.framework.GameConstants.*;

public class Skeleton implements Enemy {

    private int Defense = 15;
    private int Attack = 5;
    private int AttackCount = 1;

    public String getOwner() {
        return ENEMY;
    }

    public String getTypeString() {
        return SKELETON;
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
