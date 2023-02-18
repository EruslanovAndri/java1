package HW.Unit.Magicains;

import HW.Unit.SuperClass.Hero;

public abstract class Mgician extends Hero {
    Integer magic;
    public Mgician(String name, Integer level, Float hp, Integer maxHp, Integer magic,Integer speed) {
        super(name, level, hp, maxHp,speed);
        this.magic = magic;
    }


    @Override
    public void step() {
        int magic = getMagic();
        if(magic > 0){
            setMagic(magic-1);
        }
    }

    public Integer getMagic() {
        return magic;
    }

    public void setMagic(Integer magic) {
        this.magic = magic;
    }
}
