package Unit;

public class CrossBowMan extends Shooter{

    public CrossBowMan(String name, Float hp, int maxHp, int speed, int attack, int defence, int damage) {
        super(name, hp, maxHp, speed, attack, defence,damage);
    }



    public CrossBowMan(String name) {
        super(name,10.0f,rnd.nextInt(15,77),4,6,3, rnd.nextInt(1,4));
        super.name = name;


    }




    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("CrossBow: \t").append(CrossBowMan.super.name)
                .append("\t| HP: \t").append(CrossBowMan.super.hp)
                .append("\t| MaxHP: \t").append(CrossBowMan.super.maxHp)
                .append("\t| Speed: \t").append(CrossBowMan.super.speed)
                .append("\t| Attack: \t").append(CrossBowMan.super.attack)
                .append("\t| Defence: \t").append(CrossBowMan.super.defence)
                .append("\t| Damage: \t").append(CrossBowMan.super.damage);
    }
}