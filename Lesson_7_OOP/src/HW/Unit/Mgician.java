package HW.Unit;

public abstract class Mgician extends Hero {
    Integer magic;
    public Mgician(String name, Integer level, Integer hp, Integer maxHp, Integer magic) {
        super(name, level, hp, maxHp);
        this.magic = magic;
    }

}
