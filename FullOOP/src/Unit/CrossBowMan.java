package Unit;

public class CrossBowMan extends Shooter{

    public CrossBowMan(String name,Vector2D coords) {
        super(name,12f,20,2,2,3,2,6, coords.posX, coords.posY, 10);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("CrossBow:  \t").append(CrossBowMan.super.name)
                .append("\t| HP: \t").append(CrossBowMan.super.hp)
                .append("\t| MaxHP: \t").append(CrossBowMan.super.maxHp)
                .append("\t| Arrows: \t").append(CrossBowMan.super.getArrows())
                .append("\t| X.Y: \t").append("(").append(CrossBowMan.super.coords.posX)
                .append(",").append(CrossBowMan.super.coords.posY).append(")")
                .append("\t State: \t").append(CrossBowMan.super.state);
    }
}