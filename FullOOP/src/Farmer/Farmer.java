package Farmer;

import SuperClass.Hero;

public class Farmer extends Hero {

    protected int food;

    public Farmer(String name, Float hp, int maxHp, int speed, int food) {
        super(name, hp, maxHp, speed);
        this.food = food;
    }

    public Farmer(String name) {
        super(name,11.2f, rnd.nextInt(34,77),3 );
        this.food = 11;

    }

    @Override
    public String getInfo() {
        return String.format("Фер: %s  Food: %s",super.getInfo(),this.food);
    }
}
