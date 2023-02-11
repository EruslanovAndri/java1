package MY_OOP.Unit;

public class Shooters  extends  BaseClass{
    Integer focus;
    Integer shells;

    public Shooters(String name, Integer level, Integer hp, Integer power, String tool, Integer focus, Integer shells) {
        super(name, level, hp, power, tool);
        this.focus = focus;
        this.shells = shells;
    }
}
