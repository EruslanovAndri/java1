package Unit;

public class Sniper extends Shooter{


    public Sniper(String name, Vector2D coords) {
        super(name,15f,20,3,2,4,2,4, coords.posX, coords.posY, 6);

    }


    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Sniper: \t").append(Sniper.super.name)
                .append("\t| HP: \t").append(Sniper.super.hp)
                .append("\t| MaxHP: \t").append(Sniper.super.maxHp)
                .append("\t| Arrows: \t").append(Sniper.super.getArrows())
                .append("\t| X.Y: \t").append("(").append(Sniper.super.coords.posX)
                .append(",").append(Sniper.super.coords.posY).append(")")
                .append("\t State: \t").append(Sniper.super.state);

    }

}
