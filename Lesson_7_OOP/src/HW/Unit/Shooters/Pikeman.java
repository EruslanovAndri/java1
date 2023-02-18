package HW.Unit.Shooters;

import HW.Unit.Shooters.Shooter;

/**
 * Конструктор класса Копейщик
 */
public class Pikeman extends Shooter {

    public Pikeman(String name, Integer level, Float hp, Integer maxHp, Integer bullet,Integer speed) {
        super(name, level, hp, maxHp, bullet,speed);
    }

    public  Pikeman(String name){
        super(name,1,13.1f,33,11,1);
        super.name = name;
    }
    @Override
    public String getInfo(){
        return String.format("Копейщик: %s Bullet: %d Speed: %d",super.getInfo(),super.bullet,super.speed);
    }

}
