package Shooters;

public class Sniper extends Shooter{

    public Sniper(String name, Float hp, int maxHp, int speed, int tool) {
        super(name, hp, maxHp, speed, tool);
    }

    public Sniper(String name) {
        super(name,13.5f, rnd.nextInt(20,66),8,100 );
    }

    @Override
    public String getInfo() {
        return String.format("Сна: %s Tool: %s ",super.getInfo(),super.tool);
    }
}
