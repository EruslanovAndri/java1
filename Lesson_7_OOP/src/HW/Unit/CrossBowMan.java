package HW.Unit;

/**
 * Класс Арбалетчик
 */
public class CrossBowMan extends Shooter{
    public CrossBowMan(String name, Integer level, Integer hp, Integer maxHp, Integer bullet, Integer stamina) {
        super(name, level, hp, maxHp, bullet, stamina);
    }

    public CrossBowMan(String name){
        super(name,1,1,1,1,1);
        super.name = name;


    }

    @Override
    public void step(){};

    @Override
    public String getInfo(){
        return String.format("Я Арбалетчик! %s Bullet: %d  Stamina: %d",super.getInfo(),this.bullet,this.stamina);
    }


}
