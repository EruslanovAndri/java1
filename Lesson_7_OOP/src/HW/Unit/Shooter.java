package HW.Unit;

public abstract class Shooter extends Hero {
    Integer bullet;
    Integer stamina;
    public Shooter(String name, Integer level, Integer hp, Integer maxHp, Integer bullet, Integer stamina) {
        super(name, level, hp, maxHp);
        this.bullet = bullet;
        this.stamina = stamina;
    }

}
