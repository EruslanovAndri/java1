package Bandit;

import SuperClass.Hero;

public class Bandit extends Hero {


    public Bandit(String name, Float hp, int maxHp, int speed, int attack, int defence, int damage) {
        super(name, hp, maxHp,attack, defence, damage,speed);
        super.speed = speed;
        super.attack = attack;


    }

    public Bandit(String name) {
        super(name,10.0f, rnd.nextInt(15,45),6,8,3, rnd.nextInt(2,5) );
        super.name = name;
        super.speed = speed;
        super.attack = attack;

    }

    @Override
    public String getInfo() {
        return String.format("Bandit:  Name: %s Attack: %s  Defence: %s Damage: %s",super.getInfo(),super.attack,super.defence,super.damage);
    }

}
