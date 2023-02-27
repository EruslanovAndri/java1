package Unit;

public class Warlock extends Magician{


    public Warlock(String name,Vector2D coords) {
        super(name,11.0f,20,4,2,5,-5,-5, coords.posX, coords.posY, 50,50);
    }


    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Warlock: \t").append(Warlock.super.name)
                .append("\t| HP: \t").append(Warlock.super.hp)
                .append("\t| MaxHP: \t").append(Warlock.super.maxHp)
                .append("\t| Magic: \t").append(Warlock.super.getMagic())
//                .append("\t\t\t\t")
                .append("\t| X.Y: \t").append("(").append(Warlock.super.coords.posX)
                .append(",").append(Warlock.super.coords.posY).append(")")
                .append("\t State: \t").append(Warlock.super.state);
    }

}