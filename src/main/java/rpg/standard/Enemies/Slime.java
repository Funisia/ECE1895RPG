package rpg.standard.Enemies;

import rpg.framework.Enemy;

import static rpg.framework.GameConstants.*;

public class Slime implements Enemy {

    private int Defense = 5;
    private int Attack = 5;
    private int AttackCount = 2;

    public String getOwner() {
        return ENEMY;
    }

    public String getTypeString() {
        return SLIME;
    }

    public int getDefense() {
        return Defense;
    }

    public int getAttack() {
        return Attack;
    }

    public String getAttackType() {
        return MAGIC;
    }

    public int getAttackCount() {
        return AttackCount;
    }
}
