package Shooters;

public class Pikeman extends Shooter {

    public Pikeman(String name, Float hp, int maxHp, int speed, int attack, int defence, int damage) {
        super(name, hp, maxHp, speed, attack, defence,damage);
    }

    public Pikeman(String name) {
        super(name,10.0f, rnd.nextInt(30,100),4,4,5, rnd.nextInt(1,4));
        super.name = name;
    }


    @Override
    public String getInfo() {
        return String.format("PikeMan: Name: %s Attack: %d Defence: %s Damage: %s",super.getInfo(),super.attack,super.defence,super.damage);
    }
}
