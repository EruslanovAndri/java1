package Unit;

public class Monk extends Magician{


    public Monk(String name,Vector2D coords) {
        super(name,11f,44,2,1,3,-5,-5, coords.posX, coords.posY, 50,50);

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