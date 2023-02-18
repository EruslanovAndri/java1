package Magicians;

public class Monk extends Magician{

    public Monk(String name, Float hp, int maxHp, int speed, int magic) {
        super(name, hp, maxHp, speed, magic);
    }

    public Monk(String name) {
        super(name,12.5f,rnd.nextInt(12,47),4,3);
    }

    @Override
    public String getInfo() {
        return String.format("Мон: %s Magic: %d",super.getInfo(),this.magic);
    }
}
