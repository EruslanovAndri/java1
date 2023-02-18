package HW.Unit.Magicains;

import HW.Unit.Magicains.Mgician;

/**
 * Класс Колдун
 */
public class Warlock extends Mgician {
    public Warlock(String name, Integer level, Float hp, Integer maxHp, Integer magic,Integer speed) {
        super(name, level, hp, maxHp, magic,speed);
    }

    public Warlock(String name){
        super(name,1,1.1f,1,10,4);
        super.name = name;
    }

   @Override
   public String getInfo(){
        return String.format("Колдун: %s Magic: %s Speed: %s",super.getInfo(),this.magic,super.speed);
    }

}
