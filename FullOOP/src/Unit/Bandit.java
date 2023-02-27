package Unit;

public class Bandit extends Warrior {

    public Bandit(String name, Vector2D coords) {
        super(name,11.0f,20,4,2,6,3,6, coords.posX, coords.posY);
    }


    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Bandit: \t").append(Bandit.super.name)
                .append("\t| HP: \t").append(Bandit.super.hp)
                .append("\t| MaxHP: \t").append(Bandit.super.maxHp)
                .append("\t|\t\t\t")
                .append("\t| X.Y: \t").append("(").append(Bandit.super.coords.posX)
                .append(",").append(Bandit.super.coords.posY).append(")")
                .append("\t State: \t").append(Bandit.super.state);
    }
}