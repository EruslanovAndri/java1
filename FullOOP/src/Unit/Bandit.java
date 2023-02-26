package Unit;

public class Bandit extends Warrior {

    public Bandit(String name, Vector2D coords) {
        super(name,10.0f,20,3,4,
                2,2,4,1,1, coords.posX, coords.posY );
        super.name = name;
    }


    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Bandit: \t").append(Bandit.super.name)
                .append("\t| HP: \t").append(Bandit.super.hp)
                .append("\t| MaxHP: \t").append(Bandit.super.maxHp)
//                .append("\t| Speed: \t").append(Bandit.super.speed)
                .append("\t|\t\t\t")
//                .append("\t| Attack: \t").append(Bandit.super.attack)
//                .append("\t| Defence: \t").append(Bandit.super.defence)
//                .append("\t| DamageMin: \t").append(Bandit.super.damageMin)
//                .append("\t| DamageMax: \t").append(Bandit.super.damageMax)
                .append("\t| X.Y: \t").append("(").append(Bandit.super.coords.posX)
                .append(",").append(Bandit.super.coords.posY).append(")");
    }
}