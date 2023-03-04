package Unit;

public class Monk extends Magician{


    public Monk(String name,Vector2D coords) {
        super(name,11.0f,20,2,1,3,-5,-5, coords.posX, coords.posY, 50,50);

    }

    @Override
    public String getProfession() {
        return "Монах";
    }



}