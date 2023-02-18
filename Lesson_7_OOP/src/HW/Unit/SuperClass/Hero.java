package HW.Unit.SuperClass;

import HW.Unit.GameInterface.GameInterface;

/**
 * Общий обстрактный класс Hero
 */
public abstract class  Hero implements GameInterface {

   protected String name;
   protected Integer level,maxHp;
   protected Integer speed;
   protected  Float hp;



   protected Integer posX;
   protected Integer posY;
    /**
     * Конструктор общего класса.
     * @param name
     * @param level
     * @param hp
     * @param maxHp
     */
    public Hero(String name, Integer level, Float hp, Integer maxHp,Integer speed) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.maxHp = maxHp;
        this.speed = speed;
    }

    /**
     * Переопределил методы из интерфейса в основной класс!
     */
    @Override
    public void step() {

    }
    @Override
    public String getInfo() {
        return String.format("\t%s\t Level: %d\t HP: %f \t MaxHp: %d \t",this.name,this.level,this.hp,this.maxHp);
    }

    public Integer getSpeed() {
        return speed;
    }


}
