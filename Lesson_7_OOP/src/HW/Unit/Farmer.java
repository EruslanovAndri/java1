package HW.Unit;

import HW.Unit.SuperClass.Hero;

/**
 * Класс крестьянин
 */
public class Farmer extends Hero {

    /**
     * Конструктор класса крестьянин
     * @param name
     * @param level
     * @param hp
     * @param maxHp
     */
    public Farmer(String name, Integer level, Float hp, Integer maxHp,Integer speed) {
        super(name, level, hp, maxHp,speed);
    }

    public Farmer(String name){
        super(name,1,20.1f,20,5);
        super.name = name;
    }

    @Override
    public String getInfo(){
        return String.format("Я Фермер! %s Speed: %s ",super.getInfo(),super.speed);
    }

    @Override
    public void step() {

    }

    public void help(){

    }

}
