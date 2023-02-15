package HW.Unit;

/**
 * Класс крестьянин
 */
public class Farmer extends Hero {

    /**
     * Конструктор класса крестьянин
     * @param name
     * @param level
     * @param hp
     * @param maxHp
     */
    public Farmer(String name, Integer level, Integer hp, Integer maxHp) {
        super(name, level, hp, maxHp);
    }

    public Farmer(String name){
        super(name,1,20,20);
        super.name = name;
    }

    @Override
    public String getInfo(){
        return String.format("Я Фермер! %s",super.getInfo());
    }

    @Override
    public void step() {

    }

    public void help(){

    }

}
