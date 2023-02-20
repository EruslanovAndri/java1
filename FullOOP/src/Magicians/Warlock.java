package Magicians;

public class Warlock extends Magician{

    public Warlock(String name, Float hp, int maxHp, int speed, int attack, int defence, int damage, int magic) {
        super(name, hp, maxHp, speed, attack, defence, damage, magic);
    }

    public Warlock(String name) {
        super(name,30.0f, rnd.nextInt(10,55),9,17,12,-5,1 );
        super.name = name;
    }




    @Override
    public String getInfo() {
        return String.format("Warlock: Name: %s Attack: %s Defence: %s Damage: %s",super.getInfo(),super.attack,super.defence,super.damage);
    }

}
