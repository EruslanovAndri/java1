package Unit;

public abstract class Warrior extends Hero{

    public Warrior(String name, Float hp, int maxHp, int speed, int attack, int defence, int damageMin, int damageMax, int delivery, int shoot, int posX, int posY) {
        super(name, hp, maxHp, speed, attack, defence, damageMin, damageMax, delivery, shoot, posX, posY);
        super.name = name;
    }
}
