package Unit;

public class CrossBowMan extends Shooter{

    public CrossBowMan(String name,Vector2D coords) {
        super(name,12f,44,2,2,3,2,6, coords.posX, coords.posY, 10);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("CrossBow:  \t").append(CrossBowMan.super.name)
                .append("\t| HP: \t").append(CrossBowMan.super.hp)
                .append("\t| MaxHP: \t").append(CrossBowMan.super.maxHp)
                .append("\t| Arrows: \t").append(CrossBowMan.super.getArrows())
//                .append("\t| Speed: \t").append(CrossBowMan.super.speed)
//                .append("\t| Attack: \t").append(CrossBowMan.super.attack)
//                .append("\t| Defence: \t").append(CrossBowMan.super.defence)
//                .append("\t| DamageMin: \t").append(CrossBowMan.super.damageMin)
//                .append("\t| DamageMax: \t").append(CrossBowMan.super.damageMax)

                .append("\t| X.Y: \t").append("(").append(CrossBowMan.super.coords.posX)
                .append(",").append(CrossBowMan.super.coords.posY).append(")");
    }
}