package HW.Unit.Shooters;

import HW.Unit.Shooters.Shooter;

/**
 * Класс Арбалетчик
 */
public class CrossBowMan extends Shooter {
    public CrossBowMan(String name, Integer level, float hp, Integer maxHp, Integer bullet, Integer stamina,Integer speed) {
        super(name, level, hp, maxHp, bullet, stamina,speed);
    }

    public CrossBowMan(String name){
        super(name,1,1,1,1,1,3);
        super.name = name;


    }

    @Override
    public void step(){
        int bullet = getBullet();
        if(bullet > 0){
            setBullet(bullet -1 );
        }
    };

    @Override
    public String getInfo(){
        return String.format("Я Арбалетчик! %s Bullet: %d  Stamina: %d Speed: %s",super.getInfo(),this.bullet,this.stamina,super.speed);
    }

    @Override
    public Integer getBullet() {
        return super.getBullet();
    }

    @Override
    public void setBullet(Integer bullet) {
        super.setBullet(bullet);
    }
}
