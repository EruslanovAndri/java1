package HW.Unit.Shooters;

import HW.Unit.Shooters.Shooter;

/**
 * Класс Арбалетчик
 */
public class CrossBowMan extends Shooter {
    public CrossBowMan(String name, Integer level, float hp, Integer maxHp, Integer bullet,Integer speed) {
        super(name, level, hp, maxHp, bullet,speed);
    }

    public CrossBowMan(String name){
        super(name,1,1.0f,1,12,1);
        super.name = name;


    }

    @Override
    public String getInfo(){
        return String.format("Арбалетчик: %s Bullet: %d Speed: %s",super.getInfo(),this.bullet,super.speed);
    }


}
