package Unit;

public class Monk extends Magician{


    public Monk(String name,Vector2D coords) {
        super(name,11.0f,20,2,1,3,-5,-5, coords.posX, coords.posY, 50,50);

    }


    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Monk:  \t\t").append(Monk.super.name)
                .append("\t| HP: \t").append(Monk.super.hp)
                .append("\t| MaxHP: \t").append(Monk.super.maxHp)
                .append("\t| Magic: \t").append(Monk.super.getMagic())
                .append("\t| X.Y: \t").append("(").append(Monk.super.coords.posX)
                .append(",").append(Monk.super.coords.posY).append(")")
                .append("\t State: \t").append(Monk.super.state);
    }

}