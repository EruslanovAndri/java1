package HW.Unit.Shooters;

import HW.Unit.Shooters.Shooter;

/**
 * Конструктор класса Копейщик
 */
public class Pikeman extends Shooter {

    public Pikeman(String name, Integer level, Float hp, Integer maxHp, Integer bullet, Integer stamina,Integer speed) {
        super(name, level, hp, maxHp, bullet, stamina,speed);
    }

    public  Pikeman(String name){
        super(name,1,13.1f,33,1,1,4);
        super.name = name;
    }
    @Override
    public String getInfo(){
        return String.format("Я Копейщик! %s Stamina: %d Speed: %s",super.getInfo(),super.stamina ,super.speed);
    }

    @Override
    public void step() {
    }

    public void getPike(){

    }
}
