package HW.Unit.Shooters;

import HW.Unit.SuperClass.Hero;

public abstract class Shooter extends Hero {
    Integer bullet;

    public Shooter(String name, Integer level, Float hp, Integer maxHp, Integer bullet,Integer speed) {
        super(name, level, hp, maxHp,speed);
        this.bullet = bullet;
        this.speed = speed;
    }

    @Override
    public void step(){
        int bullet = getBullet();
        if(bullet > 0){
            setBullet(bullet -1 );
        }
    };

    public Integer getBullet() {
        return bullet;
    }

    public void setBullet(Integer bullet) {
        this.bullet = bullet;
    }
}
