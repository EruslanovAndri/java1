package HW.Unit;

import Ex007.Magician;

/**
 * Класс Монах
 */
public  class Monk extends Mgician {
    public Monk(String name, Integer level, Integer hp, Integer maxHp, Integer magic) {
        super(name, level, hp, maxHp, magic);
    }

    public Monk(String name) {
        super(name,1,1,1,1);
        super.name = name;
    }


   @Override
   public String getInfo(){
        return  String.format("Я Монах! %s Magic: %d",super.getInfo(),this.magic);
    }

    @Override
    public void step() {
    }
}
