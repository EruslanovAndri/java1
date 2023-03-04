package Unit;

import java.util.ArrayList;

public abstract class Warrior extends Hero {

    public Warrior(String name, float hp, int maxHp, int speed, int attack, int defence, int damageMin, int damageMax, int posX, int posY) {
        super(name, hp, maxHp, speed, attack, defence, damageMin, damageMax, posX, posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        builder.append(getProfession());
        return builder.append(": \t").append(name)
                .append("\t| ATK:\t").append(attack)
                .append("\t| HP:\t").append(hp)
                .append(" \t|\t\t\t|")
                .append("  (X:Y): ")
                .append(coords.posX).append(":").append(coords.posY)
                .append("\t|");
    }




    @Override
    public void step(ArrayList<Hero> team1, ArrayList<Hero> team2) {
        if (state.equals("Die")) return;
        int index = super.findNearest(team2);
        Hero enemy = (team2.get(index));
        System.out.println(coords.getDistance(enemy.coords));
        if (coords.getDistance(enemy.coords) < 2) {
            makeDamage(team2.get(index));
            return;
        }
        if (coords.getDown(enemy.coords)) {
            if (coords.posY - 1 > enemy.coords.posY && coords.getEmpty(team1, coords.posX, coords.posY - 1)) {
                stepDown();
            } else {
                sideStep(team1, enemy);
            }
        } else {
            if (coords.posY + 1 < enemy.coords.posY && coords.getEmpty(team1, coords.posX, coords.posY + 1)) {
                stepUp();
            } else {
                sideStep(team1, enemy);
            }
        }
    }

    protected void stepDown(){
        coords.posY -= 1;
    }

    protected void stepUp(){
        coords.posY += 1;
    }

    protected void sideStep(ArrayList<Hero> teams, Hero enemy){
        if(coords.getLeft(enemy.coords)){
            if(coords.getEmpty(teams,coords.posX -1 ,coords.posY)){
                coords.posX -= 1;
            }
            else {
                if(coords.getEmpty(teams,coords.posX +1, coords.posY)){
                    coords.posX += 1;
                }
            }
        }
    }
}
