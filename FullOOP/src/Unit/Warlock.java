package Unit;

public class Warlock extends Magician{


    public Warlock(String name,Vector2D coords) {
        super(name,11.0f,20,4,2,5,-5,-5, coords.posX, coords.posY, 50,50);
    }

    @Override
    public String getProfession() {
        return "Колдун";
    }

}