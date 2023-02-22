package Unit;

public class Warlock extends Magician{

    public Warlock(String name, Float hp, int maxHp, int speed, int attack, int defence, int damage, int magic) {
        super(name, hp, maxHp, speed, attack, defence, damage, magic);
    }

    public Warlock(String name) {
        super(name,30.0f, rnd.nextInt(10,55),9,17,12,-5,1 );
        super.name = name;
    }


    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Warlock: \t").append(Warlock.super.name)
                .append("\t| HP: \t").append(Warlock.super.hp)
                .append("\t| MaxHP: \t").append(Warlock.super.maxHp)
                .append("\t| Speed: \t").append(Warlock.super.speed)
                .append("\t| Attack: \t").append(Warlock.super.attack)
                .append("\t| Defence: \t").append(Warlock.super.defence)
                .append("\t| Damage: \t").append(Warlock.super.damage)
                .append("\t| Magic: \t").append(Warlock.super.getMagic());
    }

}