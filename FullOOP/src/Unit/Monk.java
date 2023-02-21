package Unit;

public class Monk extends Magician{

    public Monk(String name, Float hp, int maxHp, int attack, int defence, int damage,int speed, int magic) {
        super(name, hp, maxHp, attack, defence,damage,speed, magic);
    }

    public Monk(String name) {
        super(name,30.0f,rnd.nextInt(12,47),5,12,7,-4,1);
        super.name = name;
    }


    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("\tMonk: \t").append(Monk.super.name)
                .append("\t| HP: \t").append(Monk.super.hp)
                .append("\t| MaxHP: \t").append(Monk.super.maxHp)
                .append("\t| Speed: \t").append(Monk.super.speed)
                .append("\t| Attack: \t").append(Monk.super.attack)
                .append("\t| Defence: \t").append(Monk.super.defence)
                .append("\t| Damage: \t").append(Monk.super.damage)
                .append("\t| Magic: \t").append(Monk.super.getMagic());
    }

}
