package HW.Unit;

/**
 * Конструктор класса Копейщик
 */
public class Pikeman extends Hero{
    /**
     * Поле класса Копейщика
     */
    Integer stamina;

    /**
     * Конструктор класса Копейщик
     * @param name
     * @param level
     * @param hp
     * @param maxHp
     * @param stamina
     */
    public Pikeman(String name, Integer level, Integer hp, Integer maxHp, Integer stamina) {
        super(name, level, hp, maxHp);
        this.stamina = stamina;
    }

    public String getInfo(){
        return String.format("%s Stamina: %d",super.getInfo(),this.stamina);
    }
}
