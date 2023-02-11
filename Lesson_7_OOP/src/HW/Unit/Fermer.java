package HW.Unit;

/**
 * Класс крестьянин
 */
public class Fermer extends Hero {

    /**
     * Конструктор класса крестьянин
     * @param name
     * @param level
     * @param hp
     * @param maxHp
     */
    public Fermer(String name, Integer level, Integer hp, Integer maxHp) {
        super(name, level, hp, maxHp);
    }

    public String getInfo(){
        return String.format("%s",super.getInfo());
    }

}
