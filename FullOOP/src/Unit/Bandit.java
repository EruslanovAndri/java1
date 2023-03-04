package Unit;

public class Bandit extends Warrior {

    public Bandit(String name, Vector2D coords) {
        super(name,11.0f,20,4,2,6,3,6, coords.posX, coords.posY);
    }

    @Override
    public String getProfession() {
        return "Бандит";
    }

    @Override
    public String toString() {
        return "\uD83E\uDD77" +
                "\t| H:" + Math.round(hp) +
                "\tD:" + defence +
                " \tA:" + attack +
                " \tDmg:" + Math.round(Math.abs((damageMin + damageMax) / 2)) + "\t" +
                state;

    }

}