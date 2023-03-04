package Unit;

public class CrossBowMan extends Shooter{

    public CrossBowMan(String name,Vector2D coords) {
        super(name,12f,20,2,2,3,2,6, coords.posX, coords.posY, 10);
    }

    @Override
    public String getProfession() {
        return "Аблатечик";
    }

}