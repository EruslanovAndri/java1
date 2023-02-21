package Unit;

public class Farmer extends Hero {


//    public Farmer(String name, Float hp, int maxHp,int attack, int defence, int delivery, int damage) {
//        super(name, hp, maxHp, attack, defence, delivery, damage );
//        super.hp = hp;
//        super.maxHp = maxHp;
//
//    }

    public Farmer(String name) {
        super(name,1.0f, rnd.nextInt(34,77),3,1,1,1,1);
        super.name = name;



    }


    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Farmer: \t").append(Farmer.super.name)
                .append("\t| HP: \t").append(Farmer.super.hp)
                .append("\t| MaxHP: \t").append(Farmer.super.maxHp)
                .append("\t| Speed: \t").append(Farmer.super.speed)
                .append("\t| Attack: \t").append(Farmer.super.attack)
                .append("\t| Defence: \t").append(Farmer.super.defence)
                .append("\t| Damage: \t").append(Farmer.super.damage)
                .append("\t| Delivery: \t").append(Farmer.super.delivery);
    }



}
