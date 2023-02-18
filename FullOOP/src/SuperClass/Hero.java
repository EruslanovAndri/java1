package SuperClass;

import GameInterface.GameInterface;

import java.util.Random;

public abstract class Hero implements GameInterface {

    protected static int number;
    protected static Random rnd;

    protected static String name;
    protected static Float hp;
    protected static int maxHp;
    protected static int speed;


    static{
        Hero.number = 0;
        Hero.rnd = new Random();
    }

    public Hero(String name, Float hp, int maxHp,int speed) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.speed = speed;

    }

    @Override
    public String getInfo(){
        return String.format("Name: %s HP: %f MaxHp: %s Speed: %d",this.name,
                this.hp,this.maxHp,this.speed);

    }

    @Override
    public Integer getSpeed() {
        return speed;
    }

    @Override
    public void step() {

    }
}
