package Shooters;

public class Sniper extends Shooter{

    public Sniper(String name, Float hp, int maxHp, int speed, int attack, int defence,int damage) {
        super(name, hp, maxHp, speed, attack, defence,damage);

    }

    public Sniper(String name) {
        super(name,15.0f, rnd.nextInt(20,66),8,12,10, rnd.nextInt(8,11));
        super.name = name;

    }

    @Override
    public String getInfo() {
        return String.format("Sniper: Name: %s Attack: %d Defence: %s Damage: %s",super.getInfo(),super.attack,super.defence,super.damage);
    }

}
