package Unit;

public abstract class Warrior extends Hero{

    public Warrior(String name, float hp, int maxHp, int speed, int attack, int defence, int damageMin, int damageMax, int posX, int posY) {
        super(name, hp, maxHp, speed, attack, defence, damageMin, damageMax, posX, posY);
    }

}
