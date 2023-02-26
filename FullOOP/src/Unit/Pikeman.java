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
//                .append("\t| Speed: \t").append(Pikeman.super.speed)
                .append("\t|\t\t\t")
//                .append("\t| Attack: \t").append(Pikeman.super.attack)
//                .append("\t| Defence: \t").append(Pikeman.super.defence)
//                .append("\t| DamageMin: \t").append(Pikeman.super.damageMin)
//                .append("\t| DamageMax: \t").append(Pikeman.super.damageMax)
                .append("\t| X.Y: \t").append("(").append(Pikeman.super.coords.posX).append(",").append(Pikeman.super.coords.posY).append(")");
    }


}