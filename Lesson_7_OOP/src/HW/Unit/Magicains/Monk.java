package HW.Unit.Magicains;

import HW.Unit.Magicains.Mgician;

/**
 * Класс Монах
 */
public  class Monk extends Mgician {
    public Monk(String name, Integer level, Float hp, Integer maxHp, Integer magic,Integer speed) {
        super(name, level, hp, maxHp, magic,speed);
    }

    public Monk(String name) {
        super(name,1,1.1f,1,1,2);
        super.name = name;
    }


   @Override
   public String getInfo(){
        return  String.format("Я Монах! %s Magic: %d Speed: %s",super.getInfo(),this.magic,super.speed);
    }

    @Override
    public void step() {
    }
}
