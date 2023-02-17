package HW.Unit.Shooters;

import HW.Unit.Shooters.Shooter;

/**
 * Класс снайпер
 */

public class Sniper extends Shooter {
    public Sniper(String name, Integer level, Float hp, Integer maxHp, Integer bullet, Integer stamina,Integer speed) {
        super(name, level, hp, maxHp, bullet, stamina,speed);
    }

    public Sniper(String name){
        super(name,2,2.2f,2,2,2,4);
    }


   @Override
   public String getInfo(){
        return String.format("Я Снайпер! %s Bullet: %s Stamina: %s",super.getInfo(),super.bullet,super.stamina);
    }

    @Override
    public void step() {
    }
}
