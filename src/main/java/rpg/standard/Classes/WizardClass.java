package rpg.standard.Classes;

import rpg.framework.Class;

import static rpg.framework.GameConstants.*;

public class WizardClass implements Class {

    private int Defense = 10;
    private int Attack = 30;
    private int AttackCount = 1;

    public String getOwner() {
        return USER;
    }

    public String getTypeString() {
        return WIZARD;
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
