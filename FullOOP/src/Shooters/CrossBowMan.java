package Shooters;

public class CrossBowMan extends Shooter{

    public CrossBowMan(String name, Float hp, int maxHp, int speed, int attack, int defence, int damage) {
        super(name, hp, maxHp, speed, attack, defence,damage);
    }

    public CrossBowMan(String name) {
        super(name,10.0f,rnd.nextInt(15,77),4,6,3, rnd.nextInt(1,4));
        super.name = name;

    }

    @Override
    public String getInfo() {
        return String.format("CrossBowMan: Name: %s Attack: %d Defence: %s Damage: %s",super.getInfo(),super.attack,super.defence,super.damage);
    }
}
