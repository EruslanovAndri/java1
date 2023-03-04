package Unit;

import java.util.ArrayList;
import java.util.Random;

public abstract class Hero  implements GameInterface {

    protected static int number;
    protected static Random rnd;

    public String name;
    protected float hp;
    protected int maxHp;
    protected int speed;
    protected int attack;
    protected int defence;
    protected int damageMin;
    protected int damageMax;

    protected Vector2D coords;

    public String state;

    protected static int heroCht;


    static {
        Hero.number = 0;
        Hero.rnd = new Random();
    }

    public Hero(String name, float hp, int maxHp, int speed,
                int attack, int defence, int damageMin,
                int damageMax, int posX, int posY) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.speed = speed;
        this.attack = attack;
        this.defence = defence;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        coords = new Vector2D(posX, posY);
        this.state = "Stand";
        heroCht++;
    }


    @Override
    public Integer getSpeed() {
        return speed;
    }

    @Override
    public String getProfession() {
        return null;
    }

    @Override
    public void step(ArrayList<Hero> team1, ArrayList<Hero> team2) {

    }

    protected void getDamage(float damage) {
        this.hp -= damage;
        if (hp <= 0) {
            hp = 0;
            state = "Die";
        }
        if(hp >maxHp)hp =maxHp;
}





    public float getHp () { return this.hp; }


    protected int findNearest(ArrayList<Hero> teams){
        double min = 100;
        int index = 0;
        for (int i = 0; i < teams.size(); i++) {
            if(min > coords.getDistance(teams.get(i).coords)){
                index = i;
                min = coords.getDistance(teams.get(i).coords);
            }
        }
        return index;

    }

    public int getDamageMin() {
        return damageMin;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public static ArrayList<Hero> findLive(ArrayList<Hero> teams){
        ArrayList findLive = new ArrayList();
        for (int i = 0; i < teams.size(); i++) {
            if(teams.get(i).getHp() > 0){
                findLive.add(teams.get(i));
            }
            else{
                teams.get(i).state = "Die";
            }
        }
        return findLive;
    }

    public void  makeDamage(Hero unit){
            int damage = unit.getDefence() - attack;
            float hp;
            if(damage < 0) {
                hp = unit.getHp() - damageMax;
            } else if (damage > 0) {
                hp = unit.getHp() - damageMin;
            } else {
                hp = unit.getHp() - ((damageMax+damageMin)/2);
            }
            if(hp <= 0){
                unit.state = "Die";
                unit.setHp(0f);
            }
            else {
                unit.setHp(hp);
            }
    }

    public int getDefence() {
        return defence;
    }

    public void setHp(Float hp) {
        this.hp = hp;
    }

    public int[] getCoords() { return new int[]{coords.posX, coords.posY};}

    @Override
    public String toString() {
        return name +
                "\t| H:" + Math.round(hp) +
                "\tD:" + defence +
                " \tA:" + attack +
                " \tDmg:" + Math.round(Math.abs((damageMin+damageMax)/2)) + "\t" +
                state +"  \t"+
                "\t\t";
    }
}