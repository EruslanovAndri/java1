package HW.Unit;

import HW.Unit.SuperClass.Hero;

/**
 * Класс разбойник
 */
public class Bandit extends Hero {

    /**
     * поле класса разбойник
     */
    Boolean hide;

    /**
     * Конструктор класса разбойника
     * @param name
     * @param level
     * @param hp
     * @param maxHp
     * @param hide
     */
    public Bandit(String name, Integer level, Float hp, Integer maxHp, Boolean hide,Integer speed) {
        super(name, level, hp, maxHp,speed);
        this.hide = hide;
    }

    public Bandit(String name) {
        super(name,1,10.1f,10,2);
        super.name = name;
    }




    @Override
    public String getInfo(){
        return String.format("Я Бандит! %s Hide: %b Speed: %s ",super.getInfo(),this.hide,super.speed);

    }

    @Override
    public void step() {

    }
}
