package HW.Unit;

/**
 * Конструктор класса Копейщик
 */
public class Pikeman extends Shooter{

    public Pikeman(String name, Integer level, Integer hp, Integer maxHp, Integer bullet, Integer stamina) {
        super(name, level, hp, maxHp, bullet, stamina);
    }

    public  Pikeman(String name){
        super(name,1,13,33,1,1);
        super.name = name;
    }
    @Override
    public String getInfo(){
        return String.format("Я Копейщик! %s Stamina: %d",super.getInfo(),super.stamina);
    }

    @Override
    public void step() {
    }

    public void getPike(){

    }
}
