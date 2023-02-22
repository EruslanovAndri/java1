package Unit;

public class Bandit extends Hero {


    public Bandit(String name, Float hp, int maxHp, int speed, int attack, int defence, int damage) {
        super(name, hp, maxHp,attack, defence, damage,speed);

    }

    public Bandit(String name) {
        super(name,10.0f, rnd.nextInt(15,45),6,8,3, rnd.nextInt(2,5) );
        super.name = name;

    }


    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Bandit: \t").append(Bandit.super.name)
                .append("\t| HP: \t").append(Bandit.super.hp)
                .append("\t| MaxHP: \t").append(Bandit.super.maxHp)
                .append("\t| Speed: \t").append(Bandit.super.speed)
                .append("\t| Attack: \t").append(Bandit.super.attack)
                .append("\t| Defence: \t").append(Bandit.super.defence)
                .append("\t| Damage: \t").append(Bandit.super.damage);
    }
}