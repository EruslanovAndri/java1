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

    public Bandit(String name) {
        super(name,1,10,10);
        super.name = name;
    }




    @Override
    public String getInfo(){
        return String.format("Я Бандит! %s Hide: %b",super.getInfo(),this.hide);

    }

    @Override
    public void step() {

    }
}
