package Unit;

import java.util.ArrayList;

public class Farmer extends Hero {

    protected int arrows;


    public Farmer(String name, Vector2D coords) {
        super(name,1.0f,20,3,
                1,1,1,1, coords.posX, coords.posY);
        super.name = name;
        this.arrows = 1;




    }

    public int getArrowsFarmer() {
        return this.arrows;
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
                .append("\t    | MaxHP: \t").append(Farmer.super.maxHp)
//                .append("\t| Speed: \t").append(Farmer.super.speed)
                .append("\t| Arrows: \t").append(Farmer.this.arrows)
//                .append("\t| Attack: \t").append(Farmer.super.attack)
//                .append("\t| Defence: \t").append(Farmer.super.defence)
//                .append("\t| DamageMin: \t").append(Farmer.super.damageMin)
//                .append("\t| DamageMax: \t").append(Farmer.super.damageMax)
//                .append("\t| Delivery:\t").append(Farmer.super.delivery)

                .append("\t| X.Y: \t").append("(").append(Farmer.super.coords.posX).append(",").append(Farmer.super.coords.posY).append(")");
    }

}