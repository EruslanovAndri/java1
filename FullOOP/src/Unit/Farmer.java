package Unit;

import java.util.ArrayList;

public class Farmer extends Hero {

    protected int arrows;

    public Farmer(String name, Vector2D coords) {
        super(name,11f,20,2,1,3,3,6, coords.posX, coords.posY);
        this.arrows = 1;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder(getProfession());
        return builder.append(": \t").append(name)
                .append("\t| ATK:\t").append(attack)
                .append("\t| HP:\t").append(hp)
                .append(" \t|\t\t\t|")
//                .append("  (X:Y): ")
//                .append(coords.posX).append(":").append(coords.posY)
                .append("\t|");
    }


    @Override
    public String toString() {
        return "\uD83D\uDC69\u200D\uD83C\uDF3E" +
                "\t| H:" + Math.round(hp) +
                "\tD:" + defence +
                " \tA:" + attack +
                " \tDmg:" + Math.round(Math.abs((damageMin + damageMax) / 2)) + "\t" +
                state;

    }

    @Override
    public String getProfession() {
        return "Фермер";
    }

    @Override
    public void step(ArrayList<Hero> team1, ArrayList<Hero> team2) {
        if (state.equals("Die")) return;
        if (state.equals("Empty")) state = "Stand";
    }

}