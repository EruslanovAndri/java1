package HW.Unit;

/**
 * Класс Монах
 */
public class Monk extends Hero{
    /**
     * Поле Класса Монах
     */
    Integer magic;

    /**
     * Конструктор класса Монах
     * @param name
     * @param level
     * @param hp
     * @param maxHp
     * @param magic
     */
    public Monk(String name, Integer level, Integer hp, Integer maxHp, Integer magic) {
        super(name, level, hp, maxHp);
        this.magic = magic;
    }

    public Integer toDoMagic(){
        return this.magic;
    }

    public String getInfo(){
        return String.format("%s Magic: %d",super.getInfo(),this.magic);
    }


}
