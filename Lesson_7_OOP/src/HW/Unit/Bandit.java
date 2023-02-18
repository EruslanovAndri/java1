package HW.Unit;

import HW.Unit.SuperClass.Hero;

/**
 * Класс разбойник
 */
public class Bandit extends Hero {

    /**
     * поле класса разбойник
     */
    Integer hide;

    /**
     * Конструктор класса разбойника
     * @param name
     * @param level
     * @param hp
     * @param maxHp
     * @param hide
     */
    public Bandit(String name, Integer level, Float hp, Integer maxHp,Integer speed,Integer hide) {
        super(name, level, hp, maxHp,speed);
        this.hide = hide;
    }

    public Bandit(String name) {
        super(name,1,10.1f,10,2);
        super.name = name;
        this.hide = 2;

    }


    @Override
    public String getInfo(){
        return String.format("Бандит:%s Hide: %d Speed: %s",super.getInfo(),this.hide,super.speed);

    }

    @Override
    public void step() {
        int hide = getHide();
        if(hide > 0){
            setHide(hide-1);
        }

    }

    public Integer getHide() {
        return hide;
    }

    public void setHide(Integer hide) {
        this.hide = hide;
    }
}
