package Unit;

public class Warlock extends Magician{


    public Warlock(String name,Vector2D coords) {
        super(name,30.0f,55,9,17,12,
                -5,-5,1,2,coords.posX, coords.posY,5);
    }


    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Warlock: \t").append(Warlock.super.name)
                .append("\t| HP: \t").append(Warlock.super.hp)
                .append("\t| MaxHP: \t").append(Warlock.super.maxHp)
//                .append("\t| Speed: \t").append(Warlock.super.speed)
                .append("\t| Magic: \t").append(Warlock.super.getMagic())
//                .append("\t\t\t\t")
//                .append("\t| Attack: \t").append(Warlock.super.attack)
//                .append("\t| Defence: \t").append(Warlock.super.defence)
//                .append("\t| DamageMin: \t").append(Warlock.super.damageMin)
//                .append("\t| DamageMax: \t").append(Warlock.super.damageMax)

                .append("\t| X.Y: \t").append("(").append(Warlock.super.coords.posX).append(",").append(Warlock.super.coords.posY).append(")");
    }

}