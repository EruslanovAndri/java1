package Bandit;

import SuperClass.Hero;

public class Bandit extends Hero {

    protected int gold;

    public Bandit(String name, Float hp, int maxHp, int speed,int gold) {
        super(name, hp, maxHp, speed);
        this.gold = gold;
    }

    public Bandit(String name) {
        super(name,11.5f,rnd.nextInt(33,78),6);
        this.gold = 20;
    }

    @Override
    public String getInfo() {
        return String.format("Бан: %s Gold: %s",super.getInfo(),this.gold);
    }
}
