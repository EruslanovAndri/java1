package Unit;

public class Sniper extends Shooter{


    public Sniper(String name, Vector2D coords) {
        super(name,15f,20,3,2,4,2,4, coords.posX, coords.posY, 6);

    }
    @Override
    public String getProfession() {
        return "Снайпер";
    }


}
