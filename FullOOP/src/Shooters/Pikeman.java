package Shooters;

public class Pikeman extends Shooter {

    public Pikeman(String name, Float hp, int maxHp, int speed, int tool) {
        super(name, hp, maxHp, speed, tool);
    }

    public Pikeman(String name) {
        super(name,33.5f, rnd.nextInt(20,86),8,88 );
    }

    @Override
    public String getInfo() {
        return String.format("Коп: %s Tool: %s ",super.getInfo(),super.tool);
    }
}
