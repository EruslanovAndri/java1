package HW.Unit.Shooters;

import HW.Unit.SuperClass.Hero;

public abstract class Shooter extends Hero {
    Integer bullet;
    Integer stamina;

    public Shooter(String name, Integer level, float hp, Integer maxHp, Integer bullet, Integer stamina,Integer speed) {
        super(name, level, hp, maxHp,speed);
        this.bullet = bullet;
        this.stamina = stamina;
        this.speed = speed;
    }

    @Override
    public void step() {
    };

    public Integer getBullet() {
        return bullet;
    }

    public void setBullet(Integer bullet) {
        this.bullet = bullet;
    }
}
