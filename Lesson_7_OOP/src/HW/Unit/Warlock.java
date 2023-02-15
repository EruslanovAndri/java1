package HW.Unit;

import Ex007.Magician;

/**
 * Класс Колдун
 */
public class Warlock extends Mgician {
    public Warlock(String name, Integer level, Integer hp, Integer maxHp, Integer magic) {
        super(name, level, hp, maxHp, magic);
    }

    public Warlock(String name){
        super(name,1,1,1,1);
        super.name = name;
    }

   @Override
   public String getInfo(){
        return String.format("Я Колдун! %s Magic: %d",super.getInfo(),this.magic);
    }

    @Override
    public void step() {
    }
}
