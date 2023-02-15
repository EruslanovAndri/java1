package S8;

/**
 * Абстрактный базовый класс
 */
public abstract class Man implements GameInterface{

    private float hp;
    public int damage, att,def,maxHp;

    private static int manCnt;

    public static int getManCnt() {return manCnt;}

    public Man(float hp, int maxHp, int damage, int att, int def) {
        this.hp = hp;
        this.maxHp = maxHp;
        this.damage = damage;
        this.att = att;
        this.def = def;
        manCnt ++;
    }

    public void setHp(float hp) {if(hp >=0) this.hp = hp;}
    public float getHp() {return hp;}
    public int getDef() {return def;}

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я человек!";
    }
}
