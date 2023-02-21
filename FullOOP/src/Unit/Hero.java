package Unit;

import java.util.ArrayList;
import java.util.Random;

public abstract class Hero  implements GameInterface {

    protected static int number;
    protected static Random rnd;

    public String name;
    protected  Float hp;
    protected  int maxHp;
    protected  int speed;
    protected int attack;
    protected int defence;
    protected int damage;
    protected int delivery;

    protected int shoot;





    static{
        Hero.number = 0;
        Hero.rnd = new Random();
    }


    public Hero(String name, Float hp, int maxHp, int speed,
                int attack, int defence, int damage, int delivery, int shoot) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.speed = speed;
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.delivery = delivery;
        this.shoot = shoot;
    }


    public Hero(String name, float hp, int maxHp, int speed,int attack,int defence,int delivery,int damage) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.speed = speed;
        this.attack = attack;
        this.defence = defence;
        this.delivery = delivery;
        this.damage = damage;
    }

    public Hero(String name, Float hp, int maxHp, int speed, int attack, int defence, int damage) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.speed = speed;
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;

    }


    @Override
    public StringBuilder getInfo() {
        return null;
    }

    @Override
    public Integer getSpeed() {
        return speed;
    }

    @Override
    public void step() {

    }

    public static int getNumber() {
        return number;
    }

    public static Random getRnd() {
        return rnd;
    }


    public Float getHp() {
        return hp;
    }




}
