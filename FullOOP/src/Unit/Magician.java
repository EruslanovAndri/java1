package Unit;

import java.util.ArrayList;

public abstract class Magician extends Hero {

    protected int magic;
    protected int maxMagic;

    public Magician(String name, float hp, int maxHp, int speed, int attack, int defence, int damageMin, int damageMax, int posX, int posY, int magic,int maxMagic) {
        super(name, hp, maxHp, speed, attack, defence, damageMin, damageMax, posX, posY);
        this.magic = magic;
        this.maxMagic = maxMagic;
    }

    public int getMagic() {
        return magic;
    }


    @Override
    public void step(ArrayList<Hero> team1, ArrayList<Hero> team2) {
       ArrayList<Hero> findLive = super.findLive(team1);
       if(hp > 0 ) {
           magic = ((magic += 2) > maxMagic) ? maxMagic : magic + 2;
           if (magic > 9) {
               for (Hero hero : findLive) {
                   if (hero.getHp() < hero.getMaxHp()) {
                       healing(hero);
                       magic -= 10;
                       return;
                   }
               }
           }
       }
    }

    protected void healing(Hero hero){
        float newHp = hero.getHp() - damageMax;
        if(newHp > hero.getMaxHp()){
            hero.setHp((float)hero.getMaxHp());
        } else {
            hero.setHp(newHp);
        }
    }
}
