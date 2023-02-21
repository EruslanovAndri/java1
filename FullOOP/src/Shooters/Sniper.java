package Shooters;

public class Sniper extends Shooter{

    public Sniper(String name, Float hp, int maxHp, int speed, int attack, int defence,int damage) {
        super(name, hp, maxHp, speed, attack, defence,damage);

    }

    public Sniper(String name) {
        super(name,15.0f, rnd.nextInt(20,66),8,12,10, rnd.nextInt(8,11));
        super.name = name;

    }


    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Sniper: \t").append(Sniper.super.name)
                .append("\t| HP: \t").append(Sniper.super.hp)
                .append("\t| MaxHP: \t").append(Sniper.super.maxHp)
                .append("\t| Speed: \t").append(Sniper.super.speed)
                .append("\t| Attack: \t").append(Sniper.super.attack)
                .append("\t| Defence: \t").append(Sniper.super.defence)
                .append("\t| Damage: \t").append(Sniper.super.damage);
    }

}
