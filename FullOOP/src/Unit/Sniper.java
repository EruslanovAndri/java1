package Unit;

public class Sniper extends Shooter{


    public Sniper(String name, Vector2D coords) {
        super(name,15f,49,3,2,4,2,4, coords.posX, coords.posY, 12);

    }


    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Sniper: \t").append(Sniper.super.name)
                .append("\t| HP: \t").append(Sniper.super.hp)
                .append("\t| MaxHP: \t").append(Sniper.super.maxHp)
                .append("\t| Arrows: \t").append(Sniper.super.getArrows())
//                .append("\t| Speed: \t").append(Sniper.super.speed)
////                .append("\t| Attack: \t").append(Sniper.super.attack)
////                .append("\t| Defence: \t").append(Sniper.super.defence)
////                .append("\t| DamageMin: \t").append(Sniper.super.damageMin)
////                .append("\t| DamageMax: \t").append(Sniper.super.damageMax)

                .append("\t| X.Y: \t").append("(").append(Sniper.super.coords.posX)
                .append(",").append(Sniper.super.coords.posY).append(")");

    }

}
