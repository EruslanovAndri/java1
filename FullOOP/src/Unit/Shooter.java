package Unit;

import java.util.ArrayList;
public abstract class Shooter extends Hero {

    public Shooter(String name, Float hp, int maxHp, int speed, int attack, int defence, int damage) {
        super(name, hp, maxHp, speed, attack, defence,damage);
        super.name = name;
        super.speed = speed;
        super.attack = attack;
        super.defence = defence;
        super.damage = damage;


    }

}