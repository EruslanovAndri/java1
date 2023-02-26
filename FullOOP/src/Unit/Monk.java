package Unit;

public class Monk extends Magician{


    public Monk(String name,Vector2D coords) {
        super(name,30.0f,60,5,12,
                7,-4,-4,1,2, coords.posX, coords.posY,5);
        super.name = name;
    }


    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Monk:  \t\t").append(Monk.super.name)
                .append("\t| HP: \t").append(Monk.super.hp)
                .append("\t| MaxHP: \t").append(Monk.super.maxHp)
//                .append("\t| Speed: \t").append(Monk.super.speed)
                .append("\t| Magic: \t").append(Monk.super.getMagic())
//                .append("\t\t\t\t")
//                .append("\t| Attack: \t").append(Monk.super.attack)
//                .append("\t| Defence: \t").append(Monk.super.defence)
//                .append("\t| DamageMin: \t").append(Monk.super.damageMin)
//                .append("\t| DamageMax: \t").append(Monk.super.damageMax)

                .append("\t| X.Y: \t").append("(").append(Monk.super.coords.posX).append(",").append(Monk.super.coords.posY).append(")");
    }

}