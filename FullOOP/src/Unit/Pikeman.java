package Unit;

public class Pikeman extends Shooter {

    public Pikeman(String name, Float hp, int maxHp, int speed, int attack, int defence, int damage) {
        super(name, hp, maxHp, speed, attack, defence,damage);
    }

    public Pikeman(String name) {
        super(name,10.0f, rnd.nextInt(30,100),4,4,5, rnd.nextInt(1,4));
        super.name = name;
    }



    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("PikeMan: \t").append(Pikeman.super.name)
                .append("\t| HP: \t").append(Pikeman.super.hp)
                .append("\t| MaxHP: \t").append(Pikeman.super.maxHp)
                .append("\t| Speed: \t").append(Pikeman.super.speed)
                .append("\t| Attack: \t").append(Pikeman.super.attack)
                .append("\t| Defence: \t").append(Pikeman.super.defence)
                .append("\t| Damage: \t").append(Pikeman.super.damage);
    }
}