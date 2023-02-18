package Magicians;

import SuperClass.Hero;

public abstract class Magician extends Hero {

    int magic;

    public Magician(String name, Float hp, int maxHp, int speed, int magic) {
        super(name, hp, maxHp, speed);
        this.magic = magic;
    }


}
