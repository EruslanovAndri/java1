package HW.Unit;

import java.util.ArrayList;

/**
 * Общий обстрактный класс Hero
 */
public abstract class  Hero implements GameInterface {

   protected String name;
   protected Integer level,hp,maxHp;
    /**
     * Конструктор общего класса.
     * @param name
     * @param level
     * @param hp
     * @param maxHp
     */
    public Hero(String name, Integer level, Integer hp, Integer maxHp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.maxHp = maxHp;
    }

    /**
     * Переопределил методы из интерфейса в основной класс!
     */
    @Override
    public void step() {

    }
    @Override
    public String getInfo() {
        return String.format("Name: %s Level: %d HP: %d MaxHp: %d",this.name,
                this.level,this.hp,this.maxHp);
    }

}
