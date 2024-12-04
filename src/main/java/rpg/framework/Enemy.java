package rpg.framework;

public interface Enemy {

    public String getOwner();

    public String getTypeString();

    public int getDefense();

    public int getAttack();

    public String getAttackType();

    public int getAttackCount();
}
