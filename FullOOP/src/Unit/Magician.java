package Unit;

import java.util.ArrayList;

public abstract class Magician extends Hero {

    protected int magic;

    public Magician(String name, float hp, int maxHp, int speed, int attack,
                    int defence, int damageMin, int damageMax, int delivery, int shoot, int posX, int posY, int magic) {
        super(name, hp, maxHp, speed, attack, defence, damageMin, damageMax, delivery, shoot, posX, posY);
        this.magic = magic;
    }


    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }





//    @Override
//    public void step(ArrayList<Hero> team1, ArrayList<Hero> team2) {
//       ArrayList<Hero> findLive = findLive(team1);
//       if(hp > 0 && magic > 0){
//           for (int i = 0; i < findLive.size(); i++) {
//               if(findLive.get(i).getHp() < findLive.get(i).getMaxHp()){
//                   healing(findLive.get(i));
//               }
//               magic --;
//               return;
//
//           }
//       }
//    }
//
//    protected void healing(Hero hero){
//        float newHp = hero.getHp() - damageMax;
//        if(newHp > hero.getMaxHp()){
//            hero.setHp((float)hero.getMaxHp());
//        } else {
//            hero.setHp(newHp);
//        }
//    }
}