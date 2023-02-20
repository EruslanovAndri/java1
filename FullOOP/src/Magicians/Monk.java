package Magicians;

public class Monk extends Magician{

    public Monk(String name, Float hp, int maxHp, int attack, int defence, int damage,int speed, int magic) {
        super(name, hp, maxHp, attack, defence,damage,speed, magic);
    }

    public Monk(String name) {
        super(name,30.0f,rnd.nextInt(12,47),5,12,7,-4,1);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return String.format("Monk: %s  Speed: %s Attack: %s Defence: %s",super.getInfo(),super.speed,super.attack,super.defence);
    }

}
