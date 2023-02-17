package HW.Unit.Magicains;

import HW.Unit.SuperClass.Hero;

public abstract class Mgician extends Hero {
    Integer magic;
    public Mgician(String name, Integer level, Float hp, Integer maxHp, Integer magic,Integer speed) {
        super(name, level, hp, maxHp,speed);
        this.magic = magic;
    }

}
