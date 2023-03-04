package Unit;

public class Pikeman extends Warrior {


    public Pikeman(String name,Vector2D coords) {
        super(name,11.0f,22,3,2,3,2,4, coords.posX, coords.posY);
    }

    @Override
    public String getProfession() {
        return "Копейщик";
    }


    @Override
    public String toString() {
        return "\uD83D\uDDE1" +
                "\t| H:" + Math.round(hp) +
                "\tD:" + defence +
                " \tA:" + attack +
                " \tDmg:" + Math.round(Math.abs((damageMin + damageMax) / 2)) + "\t" +
                state;

    }


}