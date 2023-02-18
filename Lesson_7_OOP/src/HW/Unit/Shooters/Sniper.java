package HW.Unit.Shooters;

import HW.Unit.Shooters.Shooter;

/**
 * Класс снайпер
 */

public class Sniper extends Shooter {
    public Sniper(String name, Integer level, Float hp, Integer maxHp, Integer bullet,Integer speed) {
        super(name, level, hp, maxHp, bullet,speed);
    }

    public Sniper(String name){
        super(name,2,2.2f,2,2,2);
    }


   @Override
   public String getInfo(){
        return String.format("Снайпер: %s Bullet: %s Speed: %d",super.getInfo(),super.bullet,super.speed);
    }


}
