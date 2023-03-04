package Unit;

import java.util.ArrayList;
import java.util.SplittableRandom;

public abstract class Shooter extends Hero {

    protected int arrows;

    public Shooter(String name, float hp, int maxHp, int speed, int attack, int defence, int damageMin, int damageMax, int posX, int posY, int arrows) {
        super(name, hp, maxHp, speed, attack, defence, damageMin, damageMax, posX, posY);
        this.arrows = arrows;
    }

    @Override
    public String getProfession() {
        return super.getProfession();
    }


    @Override
    public int getDamageMin() {
        return super.getDamageMin();
    }


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


    @Override
    public String toString() {
        return "\uD83C\uDFF9" +
                "\t| H:" + Math.round(hp) +
                "\tD:" + defence +
                " \tA:" + attack +
                " \tDmg:" + Math.round(Math.abs((damageMin + damageMax) / 2)) + "\t" +
                state;

    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder(getProfession());
        return builder.append(": \t").append(name)
                .append("\t| ATK:\t").append(attack)
                .append("\t| HP:\t").append(hp)
                .append(" \t| Arrows:").append(arrows)
                .append("\t|")
                .append("  (X:Y): ")
                .append(coords.posX).append(":").append(coords.posY)
                .append("\t|");

    }

        protected boolean findFarmer (ArrayList < Hero > teams) {
            ArrayList<Hero> arrayFarmer = new ArrayList<>();
            for (Hero hero : teams) {
                if (hero.getProfession().equals("Фермер") && hero.state.equals("Stand")) {
                    arrayFarmer.add(hero);
                }
            }
            switch (arrayFarmer.size()) {
                case (0) -> {
                    return false;
                }
                case (1) -> {
                    arrayFarmer.get(0).state = "Empty";
                    return true;
                }
                default -> {
                    arrayFarmer.get(findNearest(arrayFarmer)).state = "Empty";
                    return true;
                }
            }
        }
    }
