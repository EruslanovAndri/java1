package Unit;

import java.util.ArrayList;
import java.util.SplittableRandom;

public abstract class Shooter extends Hero {

    private int arrows;

    public Shooter(String name, float hp, int maxHp, int speed, int attack, int defence, int damageMin, int damageMax, int posX, int posY, int arrows) {
        super(name, hp, maxHp, speed, attack, defence, damageMin, damageMax, posX, posY, arrows);
        this.arrows = arrows;
        super.name = name;
    }


    public int getArrows() {
        return arrows;
    }
    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
    @Override
    public int getDamageMin() {
        return super.getDamageMin();
    }
    @Override
    public void makeDamage(Hero unit) {
        float damage = unit.getDefence() - attack;
        if (damage < 0) {
            setHp(unit.getHp() - damageMin);
            this.setArrows(this.getArrows() - 1);
        } else if (damage > 0) {
            setHp(unit.getHp() - damageMax);
        } else {
            setHp(unit.getHp() - ((damageMax + damageMin) / 2));
            this.setArrows(this.getArrows() - 1);
        }
    }


    // 3. Реализовать метод step() лучников.
// 3.1 Если жизнь равна нулю или стрел нет, завершить оьработку.
// 3.2 Поиск среди противников наиболее приближённого.
// 3.3 Нанести среднее повреждение найденному противнику.
// 3.4 Найти среди своих крестьянина.
// 3.5 Если найден завершить метод иначе уменьшить запас стрел на одну.

    @Override
    public void step(ArrayList<Hero> team1, ArrayList<Hero> team2) {
        if (hp > 0) {
            if (arrows > 0) {
                int index = super.findNearest(team2);
                makeDamage(team2.get(index));
                if (findFarmer(team1)) {
                    return;
                }
                arrows--;
            }
        }
    }


    protected  boolean findFarmer(ArrayList<Hero> teams){
        ArrayList<Hero> arrayFarmer = new ArrayList<>();
        for (int i = 0; i < teams.size(); i++) {
            if(teams.get(i).getInfo().toString().split(":")[0].equals("Farmer")
            && ((Farmer)teams.get(i)).getArrowsFarmer() > 0){
                arrayFarmer.add(teams.get(i));
            }

        }
        switch (arrayFarmer.size()){
            case(0):
                return false;
            case (1):
                ((Farmer) arrayFarmer.get(0)).setArrowsFarmer(0);
                return true;
            default:
                ((Farmer) arrayFarmer.get(findNearest(arrayFarmer))).setArrowsFarmer(0);
                return true;
        }
    }

}
