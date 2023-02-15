package HW.Unit;

/**
 * Класс снайпер
 */

public class Sniper extends Shooter{
    public Sniper(String name, Integer level, Integer hp, Integer maxHp, Integer bullet, Integer stamina) {
        super(name, level, hp, maxHp, bullet, stamina);
    }

    public Sniper(String name){
        super(name,2,2,2,2,2);
    }


   @Override
   public String getInfo(){
        return String.format("Я Снайпер! %s Bullet: %s Stamina: %s",super.getInfo(),super.bullet,super.stamina);
    }

    @Override
    public void step() {
    }
}
