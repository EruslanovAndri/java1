package Magicians;

public class Warlock extends Magician{

    public Warlock(String name, Float hp, int maxHp, int speed, int magic) {
        super(name, hp, maxHp, speed, magic);
    }

    public Warlock(String name) {
        super(name,11.2f, rnd.nextInt(25,100),4,6 );
    }

    @Override
    public String getInfo() {
        return String.format("Кол: %s Magic: %d",super.getInfo(),this.magic);
    }
}
