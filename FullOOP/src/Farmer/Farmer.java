package Farmer;

import Bandit.Bandit;
import GameInterface.GameInterface;
import SuperClass.Hero;

import java.nio.file.attribute.FileAttribute;

public class Farmer extends Hero {


    public Farmer(String name, Float hp, int maxHp,int attack, int defence, int delivery, int damage) {
        super(name, hp, maxHp, attack, defence, delivery, damage );
//        super.hp = hp;
//        super.maxHp = maxHp;
//        super.attack = attack;
//        super.defence = defence;
//        super.delivery = delivery;
//        super.damage = damage;

    }

    public Farmer(String name) {
        super(name,1.0f, rnd.nextInt(34,77),3,1,1,1,1);
//        super.attack = 1;
//        super.defence = 1;
//        super.delivery = 1;
//        super.damage = 1;
//        super.speed = 3;
        super.name = name;



    }
    @Override
    public String getInfo() {
        return String.format("Farmer: Name: %s Attack: %s Defence: %s Damage: %s Delivery: %s",super.getInfo(),super.attack,super.defence,super.damage,super.delivery);

    }



}
