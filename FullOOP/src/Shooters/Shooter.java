package Shooters;

import SuperClass.Hero;

public abstract class Shooter extends Hero {
    /**
     * кол-во пуль,стрел,копий.
     */
    protected int tool;

    public Shooter(String name, Float hp, int maxHp, int speed, int tool) {
        super(name, hp, maxHp, speed);
        this.tool = tool;
    }
}
