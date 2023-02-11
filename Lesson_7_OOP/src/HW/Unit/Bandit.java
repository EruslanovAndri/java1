package HW.Unit;

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
    public Bandit(String name, Integer level, Integer hp, Integer maxHp, Boolean hide) {
        super(name, level, hp, maxHp);
        this.hide = hide;
    }

    public String getInfo(){
        return String.format("%s Hide: %b",super.getInfo(),this.hide);

    }



}
