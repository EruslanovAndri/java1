package Unit;

public class Pikeman extends Warlock {


    public Pikeman(String name, Vector2D coords) {
        super(name, coords);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("PikeMan: \t").append(Pikeman.super.name)
                .append("\t| HP: \t").append(Pikeman.super.hp)
                .append("\t| MaxHP: \t").append(Pikeman.super.maxHp)
                .append("\t|\t\t\t")
                .append("\t| X.Y: \t").append("(").append(Pikeman.super.coords.posX)
                .append(",").append(Pikeman.super.coords.posY).append(")")
                .append("\t State: \t").append(Pikeman.super.state);
    }


}