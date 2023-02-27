package Unit;

import java.util.ArrayList;

public class Farmer extends Hero {

    protected int arrows;

    public Farmer(String name, Vector2D coords) {
        super(name,11f,20,2,1,3,3,6, coords.posX, coords.posY);
        this.arrows = 1;
    }

    public int getArrowsFarmer() {
        return arrows;
    }

    public void setArrowsFarmer(int arrows) {
        this.arrows = arrows;
    }

    @Override
    public void step(ArrayList<Hero> team1, ArrayList<Hero> team2) {
        arrows = 1;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Farmer: \t").append(Farmer.super.name)
                .append("\t| HP: \t").append(Farmer.super.hp)
                .append("\t| MaxHP: \t").append(Farmer.super.maxHp)
                .append("\t| Arrows: \t").append(Farmer.this.arrows)
                .append("\t| X.Y: \t").append("(").append(Farmer.super.coords.posX)
                .append(",").append(Farmer.super.coords.posY).append(")")
                .append("\t State: \t").append(Farmer.super.state);
    }

}