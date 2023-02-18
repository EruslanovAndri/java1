package Shooters;

public class CrossBowMan extends Shooter{

    public CrossBowMan(String name, Float hp, int maxHp, int speed, int tool) {
        super(name, hp, maxHp, speed, tool);
    }

    public CrossBowMan(String name) {
        super(name,22.5f, rnd.nextInt(20,66),6,150 );
    }

    @Override
    public String getInfo() {
        return String.format("Арб: %s Tool: %d ",super.getInfo(),super.tool);
    }
}
