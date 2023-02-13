package HW.Unit;

/**
 * Класс Колдун
 */
public class Warlock extends Hero{

    Integer magic;


    /**
     * Конструктор общего класса.
     *
     * @param name
     * @param level
     * @param hp
     * @param maxHp
     * @param magic
     */
    public Warlock(String name, Integer level, Integer hp, Integer maxHp,Integer magic) {
        super(name, level, hp, maxHp);
        this.magic = magic;

    }
    public String getInfo(){
        return String.format("%s Magic: %d",super.getInfo(),this.magic);
    }

    public Integer toDoMagic(){
        return this.magic;
    }
}
