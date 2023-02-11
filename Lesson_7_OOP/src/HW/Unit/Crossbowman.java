package HW.Unit;

/**
 * Класс Арбалетчик
 */
public class Crossbowman extends Hero{

    /**
     * Поле класса Арбалетчика
     */
    Integer arrow;
    Integer stamina;

    /**
     * Конструктор класса Арбалетчика
     * @param name
     * @param level
     * @param hp
     * @param maxHp
     * @param arrow
     * @param stamina
     */
    public Crossbowman(String name, Integer level, Integer hp, Integer maxHp, Integer arrow, Integer stamina) {
        super(name, level, hp, maxHp);
        this.arrow = arrow;
        this.stamina = stamina;
    }


    public String getInfo(){
        return String.format("%s Arrow: %d  Stamina: %d",super.getInfo(),this.arrow,this.stamina);
    }

    public void attack(){

    }
}
