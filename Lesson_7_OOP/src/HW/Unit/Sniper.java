package HW.Unit;

/**
 * Класс снайпер
 */

public class Sniper extends Hero{

    /**
     * Поле класса Снайпер
     */
    Integer precision;


    /**
     * Конструктор класса Снайпер
     * @param name
     * @param level
     * @param hp
     * @param maxHp
     * @param precision
     */
    public Sniper(String name, Integer level, Integer hp, Integer maxHp, Integer precision) {
        super(name, level, hp, maxHp);
        this.precision = precision;
    }

    public String getInfo(){
        return String.format("%s Precision: %d",super.getInfo(),this.precision);
    }
}
